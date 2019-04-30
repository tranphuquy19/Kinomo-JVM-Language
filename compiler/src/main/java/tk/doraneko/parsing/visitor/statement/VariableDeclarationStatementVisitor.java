package tk.doraneko.parsing.visitor.statement;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ExpressionContext;
import tk.doraneko.antlr.KinomoParser.VariableDeclarationContext;
import tk.doraneko.domain.node.expression.Expression;
import tk.doraneko.domain.node.statement.VariableDeclaration;
import tk.doraneko.domain.scope.LocalVariable;
import tk.doraneko.domain.scope.Scope;
import tk.doraneko.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class VariableDeclarationStatementVisitor extends KinomoBaseVisitor<VariableDeclaration> {
    private final ExpressionVisitor expressionVisitor;
    private final Scope scope;

    public VariableDeclarationStatementVisitor(ExpressionVisitor expressionVisitor, Scope scope) {
        this.expressionVisitor = expressionVisitor;
        this.scope = scope;
    }

    public VariableDeclaration visitVariableDeclaration(@NotNull VariableDeclarationContext ctx) {
        String varName = ctx.name().getText();
        ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
        return new VariableDeclaration(varName, expression);
    }
}