package tk.doraneko.domain.node.expression;

import tk.doraneko.bytecodegeneration.expression.ExpressionGenerator;
import tk.doraneko.bytecodegeneration.statement.StatementGenerator;
import tk.doraneko.domain.node.statement.Statement;
import tk.doraneko.domain.type.Type;

public interface Expression extends Statement {
    Type getType();
    void accept(ExpressionGenerator genrator);
    @Override
    void accept(StatementGenerator generator);
}
