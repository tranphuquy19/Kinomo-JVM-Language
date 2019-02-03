package tk.doraneko.antlr.domain.expression;

import tk.doraneko.antlr.domain.type.Type;

public class Value extends Expression {

    private String value;

    public Value(Type type, String value) {
        super(type);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
