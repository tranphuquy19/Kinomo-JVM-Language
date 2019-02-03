package tk.doraneko.bytecodegeneration.instructions;


import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import tk.doraneko.parsing.domain.Variable;
import tk.doraneko.antlr.KinomoLexer;


public class VariableDeclaration implements Instruction,Opcodes {
    Variable variable;

    public VariableDeclaration(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = variable.getType();
        if(type == KinomoLexer.NUMBER) {
            int val = Integer.valueOf(variable.getValue());
            mv.visitIntInsn(BIPUSH,val);
            mv.visitVarInsn(ISTORE,variable.getId());
        } else if(type == KinomoLexer.STRING) {
            mv.visitLdcInsn(variable.getValue());
            mv.visitVarInsn(ASTORE,variable.getId());
        }
    }
}
