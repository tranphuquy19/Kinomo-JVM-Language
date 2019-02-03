package tk.doraneko;

import org.apache.commons.lang3.StringUtils;
import org.objectweb.asm.Opcodes;
import tk.doraneko.bytecodegeneration.BytecodeGenerator;
import tk.doraneko.bytecodegeneration.instructions.Instruction;
import tk.doraneko.parsing.SyntaxTreeTraverser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Queue;

public class Compiler implements Opcodes {

    public static void main(String[] args) throws Exception {
        new Compiler().compile(args);
    }

    public void compile(String[] args) throws Exception {
        final ARGUMENT_ERRORS argumentsErrors = getArgumentValidationErrors(args);
        if(argumentsErrors != ARGUMENT_ERRORS.NONE) {
            System.out.println(argumentsErrors.getMessage());
            return;
        }
        final File kinomoFile = new File(args[0]);

        //Debug
        //final File kinomoFile = new File("C:\\Users\\Tran Phu Quy\\IdeaProjects\\Kinomo-JVM-Language\\KinomoExamples\\first.ki");
        String fileName = kinomoFile.getName();
        String fileAbsolutePath = kinomoFile.getAbsolutePath();
        String className = StringUtils.remove(fileName, ".ki");
        final Queue<Instruction> instructionsQueue = new SyntaxTreeTraverser().getInstructions(fileAbsolutePath);
        final byte[] byteCode = new BytecodeGenerator().generateBytecode(instructionsQueue, className);
        saveBytecodeToClassFile(fileName, byteCode);
    }

    private ARGUMENT_ERRORS getArgumentValidationErrors(String[] args) {
        if(args.length != 1) {
            return ARGUMENT_ERRORS.NO_FILE;
        }
        String filePath=args[0];
        if (!filePath.endsWith(".ki")) {
            return ARGUMENT_ERRORS.BAD_FILE_EXTENSION;
        }
        return ARGUMENT_ERRORS.NONE;
    }

    private static void saveBytecodeToClassFile(String fileName, byte[] byteCode) throws IOException {
        final String classFile = StringUtils.replace(fileName, ".ki", ".class");
        OutputStream os = new FileOutputStream(classFile);
        os.write(byteCode);
        os.close();
    }
}
