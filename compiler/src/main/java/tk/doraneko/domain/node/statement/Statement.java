package tk.doraneko.domain.node.statement;

import tk.doraneko.bytecodegeneration.statement.StatementGenerator;
import tk.doraneko.domain.node.Node;

@FunctionalInterface
public interface Statement extends Node {
    void accept(StatementGenerator generator);
}
