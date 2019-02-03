package tk.doraneko.bytecodegenerator;

import tk.doraneko.antlr.domain.classs.Function;
import tk.doraneko.antlr.domain.expression.Identifier;
import tk.doraneko.antlr.domain.global.ClassDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.List;

public class ClassGenerator {

    private static final int CLASS_VERSION = 52;
    private ClassWriter classWriter;

    public ClassGenerator() {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
    }

    public ClassWriter generate(ClassDeclaration classDeclaration) {
        String name = classDeclaration.getName();
        classWriter.visit(CLASS_VERSION, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,name,null,"java/lang/Object",null);
        List<Function> methods = classDeclaration.getMethods();
        List<Identifier> identifiers = new ArrayList<>();
        methods.forEach((method) -> {
            String methodName = method.getName();
            Identifier identifier = new Identifier(methodName, method);
            identifiers.add(identifier);
        });
        methods.forEach(function -> new MethodGenerator(classWriter).generate(function));
        classWriter.visitEnd();
        return classWriter;
    }
}
