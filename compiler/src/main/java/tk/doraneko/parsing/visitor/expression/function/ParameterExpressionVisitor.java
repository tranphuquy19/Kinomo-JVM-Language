package tk.doraneko.parsing.visitor.expression.function;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ParameterContext;
import tk.doraneko.antlr.KinomoParser.ParameterWithDefaultValueContext;
import tk.doraneko.domain.node.expression.Expression;
import tk.doraneko.domain.node.expression.Parameter;
import tk.doraneko.domain.type.Type;
import tk.doraneko.parsing.visitor.expression.ExpressionVisitor;
import tk.doraneko.util.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

public class ParameterExpressionVisitor extends KinomoBaseVisitor<Parameter> {

    private final ExpressionVisitor expressionVisitor;

    public ParameterExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    public Parameter visitParameter(@NotNull ParameterContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        return new Parameter(name, type, Optional.empty());
    }

    public Parameter visitParameterWithDefaultValue(@NotNull ParameterWithDefaultValueContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        Expression defaultValue = ctx.defaultValue.accept(expressionVisitor);
        return new Parameter(name, type, Optional.of(defaultValue));
    }
}
