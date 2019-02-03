package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.KinomoParser.ExpressionContext;
import tk.doraneko.antlr.domain.expression.Expression;
import tk.doraneko.antlr.domain.expression.Identifier;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.statement.PrintStatement;
import tk.doraneko.antlr.domain.statement.Statement;
import tk.doraneko.antlr.domain.statement.VariableDeclarationStatement;
import org.antlr.v4.runtime.misc.NotNull;


public class StatementVisitor extends KinomoBaseVisitor<Statement> {

    private Scope scope;

    public StatementVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Statement visitPrintStatement(@NotNull KinomoParser.PrintStatementContext ctx) {
        KinomoParser.ExpressionContext expressionCtx = ctx.expression();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        Expression expression = expressionCtx.accept(expressionVisitor);
        return new PrintStatement(expression);
    }

    @Override
    public Statement visitVariableDeclaration(@NotNull KinomoParser.VariableDeclarationContext ctx) {
        String identifierText = ctx.identifier().getText();
        int index = ctx.index;
        ExpressionContext expressionCtx = ctx.expression();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        Expression expression = expressionCtx.accept(expressionVisitor);
        Identifier identifier = new Identifier(identifierText,expression);
        scope.addIdentifier(identifier);
        return new VariableDeclarationStatement(identifier.getName(), expression,index);
    }
}
