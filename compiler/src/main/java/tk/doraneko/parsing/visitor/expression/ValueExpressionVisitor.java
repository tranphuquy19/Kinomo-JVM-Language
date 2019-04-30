package tk.doraneko.parsing.visitor.expression;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ValueContext;
import tk.doraneko.domain.node.expression.Value;
import tk.doraneko.domain.type.Type;
import tk.doraneko.util.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

public class ValueExpressionVisitor extends KinomoBaseVisitor<Value> {

    public Value visitValue(@NotNull ValueContext ctx) {
        String value = ctx.getText();
        Type type = TypeResolver.getFromValue(ctx);
        return new Value(type, value);
    }
}