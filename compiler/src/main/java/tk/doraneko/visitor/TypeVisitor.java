package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.domain.type.BultInType;
import tk.doraneko.antlr.domain.type.ClassType;
import tk.doraneko.antlr.domain.type.Type;
import org.antlr.v4.runtime.misc.NotNull;
import org.apache.commons.lang3.StringUtils;


public class TypeVisitor extends KinomoBaseVisitor<Type> {

    @Override
    public Type visitValue(@NotNull KinomoParser.ValueContext ctx) {
        if(ctx == null) return BultInType.VOID;
        String stringType = ctx.getText();
        if(StringUtils.isNumeric(stringType)) {
            return BultInType.INT;
        }
        return new ClassType(stringType);
    }

    @Override
    public Type visitPrimitiveType(@NotNull KinomoParser.PrimitiveTypeContext ctx) {
        return BultInType.fromString(ctx.getText());
    }

    @Override
    public Type visitClassType(@NotNull KinomoParser.ClassTypeContext ctx) {
        return new ClassType(ctx.getText());
    }
}
