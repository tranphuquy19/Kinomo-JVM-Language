package tk.doraneko.antlr.domain.expression;

import tk.doraneko.antlr.domain.statement.Statement;
import tk.doraneko.antlr.domain.type.Type;

public abstract class Expression implements Statement {
    private Type type;

    public Expression(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
