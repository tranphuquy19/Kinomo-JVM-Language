package tk.doraneko.domain.node.statement;

import tk.doraneko.bytecodegeneration.statement.StatementGenerator;
import tk.doraneko.domain.node.expression.Expression;

public class PrintStatement implements Statement {

    private final Expression expression;

    public PrintStatement(Expression expression) {

        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
