package tk.doraneko.domain.node.expression;

import tk.doraneko.bytecodegeneration.expression.ExpressionGenerator;
import tk.doraneko.bytecodegeneration.statement.StatementGenerator;

public interface Reference extends Expression {
    String geName();

    @Override
    void accept(ExpressionGenerator genrator);

    @Override
    void accept(StatementGenerator generator);
}
