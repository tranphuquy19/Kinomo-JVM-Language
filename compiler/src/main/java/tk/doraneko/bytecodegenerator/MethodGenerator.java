package tk.doraneko.bytecodegenerator;

import tk.doraneko.antlr.domain.classs.Function;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.statement.Statement;
import tk.doraneko.utils.DescriptorFactory;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Collection;

public class MethodGenerator {

    private final ClassWriter classWriter;

    public MethodGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public void generate(Function function) {
        Scope scope = function.getScope();
        String name = function.getName();
        String description = DescriptorFactory.getMethodDescriptor(function);
        Collection<Statement> instructions = function.getStatements();
        int access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;//(function.getName().equals("main") ? Opcodes.ACC_STATIC : 0);
        MethodVisitor mv = classWriter.visitMethod(access, name, description, null, null);
        mv.visitCode();
        StatementGenerator statementScopeGenrator = new StatementGenerator(mv);
        instructions.forEach(instr -> statementScopeGenrator.generate(instr,scope));
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(-1,-1);
        mv.visitEnd();
    }
}
