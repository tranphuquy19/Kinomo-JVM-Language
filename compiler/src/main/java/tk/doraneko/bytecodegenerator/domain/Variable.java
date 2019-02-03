package tk.doraneko.bytecodegenerator.domain;

import tk.doraneko.antlr.domain.expression.Value;
import tk.doraneko.antlr.domain.type.Type;

public class Variable {
    private final Value value;
    private final String name;
    private final int index;

    public Variable(Value value, String name, int index) {
        this.value = value;
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public Value getValue() {
        return value;
    }

    public Type getType() {
        return value.getType();
    }
}
