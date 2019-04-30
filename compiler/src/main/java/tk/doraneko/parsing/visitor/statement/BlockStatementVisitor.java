package tk.doraneko.parsing.visitor.statement;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.BlockContext;
import tk.doraneko.antlr.KinomoParser.StatementContext;
import tk.doraneko.domain.node.statement.Block;
import tk.doraneko.domain.node.statement.Statement;
import tk.doraneko.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class BlockStatementVisitor extends KinomoBaseVisitor<Block>{
    private final Scope scope;

    public BlockStatementVisitor(Scope scope) {
        this.scope = scope;
    }

    public Block visitBlock(@NotNull BlockContext ctx) {
        List<StatementContext> blockstatementsCtx = ctx.statement();
        Scope newScope = new Scope(scope);
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        List<Statement> statements = blockstatementsCtx.stream().map(smtt -> smtt.accept(statementVisitor)).collect(Collectors.toList());
        return new Block(newScope, statements);
    }
}