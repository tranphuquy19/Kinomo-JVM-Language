package tk.doraneko.antlr.domain.expression;

public class Identifier extends Expression {
    private String name;
    private Expression expression;

    public Identifier(String name, Expression expression) {
        super(expression.getType());
        this.expression = expression;
        this.name = name;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }

}

