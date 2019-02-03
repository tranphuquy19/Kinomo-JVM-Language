package tk.doraneko.bytecodegenerator;

import tk.doraneko.antlr.domain.expression.Expression;
import tk.doraneko.antlr.domain.expression.Identifier;
import tk.doraneko.antlr.domain.expression.Value;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.statement.PrintStatement;
import tk.doraneko.antlr.domain.statement.Statement;
import tk.doraneko.antlr.domain.statement.VariableDeclarationStatement;
import tk.doraneko.antlr.domain.type.BultInType;
import tk.doraneko.antlr.domain.type.ClassType;
import tk.doraneko.antlr.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class StatementGenerator {

    private MethodVisitor methodVisitor;
    private ExpressionGenrator expressionGenrator;

    public StatementGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
        expressionGenrator = new ExpressionGenrator(methodVisitor);
    }

    public void generate(Statement expression, Scope scope) {
        if (expression instanceof PrintStatement) {
            PrintStatement printStatement = (PrintStatement) expression;
            generate(printStatement, scope);
        } else if (expression instanceof VariableDeclarationStatement) {
            VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) expression;
            generate(variableDeclarationStatement, scope);
        } else if (expression instanceof Expression) {
            expressionGenrator.generate((Expression) expression,scope);
        }
    }

    public void generate(PrintStatement printStatement, Scope scope) {
        ExpressionGenrator expressionGenrator = new ExpressionGenrator(methodVisitor);
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expressionGenrator.generate(expression, scope);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        ClassType owner = new ClassType("java.io.PrintStream");
        String fieldDescriptor = owner.getDescriptor();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL,fieldDescriptor, "println", descriptor, false);
    }

    public void generate(VariableDeclarationStatement variableDeclarationStatement, Scope scope) {
        Expression expression = variableDeclarationStatement.getExpression();
        String name = variableDeclarationStatement.getName();
        if (expression instanceof Value) {
            Value value = (Value) expression;
            Type type = value.getType();
            String stringValue = value.getValue();
            if (type == BultInType.INT) {
                int val = Integer.parseInt(stringValue);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, val);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, 0);
            } else if (type == BultInType.STRING) {
                methodVisitor.visitLdcInsn(value);
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 0);
            }
        }
        scope.addIdentifier(new Identifier(name,expression));
    }
}
