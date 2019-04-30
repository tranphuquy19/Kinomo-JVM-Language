package tk.doraneko.parsing.visitor.expression;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ConditionalExpressionContext;
import tk.doraneko.antlr.KinomoParser.ExpressionContext;
import tk.doraneko.domain.CompareSign;
import tk.doraneko.domain.node.expression.ConditionalExpression;
import tk.doraneko.domain.node.expression.Expression;
import tk.doraneko.domain.node.expression.Value;
import tk.doraneko.domain.type.BultInType;
import org.antlr.v4.runtime.misc.NotNull;

public class ConditionalExpressionVisitor extends KinomoBaseVisitor<ConditionalExpression> {
    private final ExpressionVisitor expressionVisitor;

    public ConditionalExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    public ConditionalExpression visitConditionalExpression(@NotNull ConditionalExpressionContext ctx) {
        ExpressionContext leftExpressionCtx = ctx.expression(0);
        ExpressionContext rightExpressionCtx = ctx.expression(1);
        Expression leftExpression = leftExpressionCtx.accept(expressionVisitor);
        Expression rightExpression = rightExpressionCtx != null ? rightExpressionCtx.accept(expressionVisitor) : new Value(BultInType.INT, "0");
        CompareSign cmpSign = ctx.cmp != null ? CompareSign.fromString(ctx.cmp.getText()) : CompareSign.NOT_EQUAL;
        return new ConditionalExpression(leftExpression, rightExpression, cmpSign);
    }
}