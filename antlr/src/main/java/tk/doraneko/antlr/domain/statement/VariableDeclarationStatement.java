package tk.doraneko.antlr.domain.statement;


import tk.doraneko.antlr.domain.expression.Expression;


public class VariableDeclarationStatement implements Statement {
    private final String name;
    private final Expression expression;
    private final int index;

    public VariableDeclarationStatement(String name, Expression expression, int index) {
        this.expression = expression;
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }
}
