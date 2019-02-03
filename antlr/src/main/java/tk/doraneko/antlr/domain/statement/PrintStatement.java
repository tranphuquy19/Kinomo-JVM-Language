package tk.doraneko.antlr.domain.statement;

import tk.doraneko.antlr.domain.expression.Expression;

public class PrintStatement implements Statement {

    private Expression expression;

    public PrintStatement(Expression expression) {

        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
