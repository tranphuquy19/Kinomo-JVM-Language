package tk.doraneko.domain.node.statement;

import tk.doraneko.bytecodegeneration.statement.StatementGenerator;
import tk.doraneko.domain.node.expression.Expression;

public class Assignment implements Statement{
    private final String varName;
    private final Expression expression;

    public Assignment(String varName, Expression expression) {
        this.varName = varName;
        this.expression = expression;
    }

    public Assignment(VariableDeclaration declarationStatement) {
        this.varName = declarationStatement.getName();
        this.expression = declarationStatement.getExpression();
    }

    public String getVarName() {
        return varName;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
