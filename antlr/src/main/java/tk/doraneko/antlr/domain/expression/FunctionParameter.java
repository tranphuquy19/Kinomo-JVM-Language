package tk.doraneko.antlr.domain.expression;

import tk.doraneko.antlr.domain.type.Type;

public class FunctionParameter extends Expression {
    private final String name;
    private final int index;

    public FunctionParameter(String name, Type type, int index) {
        super(type);
        this.name = name;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
