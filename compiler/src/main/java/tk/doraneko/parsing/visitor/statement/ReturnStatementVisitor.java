package tk.doraneko.parsing.visitor.statement;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ReturnVoidContext;
import tk.doraneko.antlr.KinomoParser.ReturnWithValueContext;
import tk.doraneko.domain.node.expression.EmptyExpression;
import tk.doraneko.domain.node.expression.Expression;
import tk.doraneko.domain.node.statement.ReturnStatement;
import tk.doraneko.domain.type.BultInType;
import tk.doraneko.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class ReturnStatementVisitor extends KinomoBaseVisitor<ReturnStatement> {
    private final ExpressionVisitor expressionVisitor;

    public ReturnStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    public ReturnStatement visitReturnVoid(@NotNull ReturnVoidContext ctx) {
        return new ReturnStatement(new EmptyExpression(BultInType.VOID));
    }

    public ReturnStatement visitReturnWithValue(@NotNull ReturnWithValueContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new ReturnStatement(expression);
    }
}