package tk.doraneko.domain.node.expression;

import tk.doraneko.bytecodegeneration.expression.ExpressionGenerator;
import tk.doraneko.bytecodegeneration.statement.StatementGenerator;
import tk.doraneko.domain.type.Type;

public class Value implements Expression {

    private final String value;
    private final Type type;

    public Value(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return type;
    }
}
