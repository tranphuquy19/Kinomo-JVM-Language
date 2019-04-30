package tk.doraneko.domain.node.statement;

import tk.doraneko.bytecodegeneration.statement.StatementGenerator;
import tk.doraneko.domain.node.expression.Expression;

public class ReturnStatement implements Statement {

    private final Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    public Expression getExpression() {
        return expression;
    }
}
