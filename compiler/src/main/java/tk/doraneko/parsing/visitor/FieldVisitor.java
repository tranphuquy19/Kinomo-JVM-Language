package tk.doraneko.parsing.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.domain.scope.Field;
import tk.doraneko.domain.scope.Scope;
import tk.doraneko.domain.type.Type;
import tk.doraneko.util.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

public class FieldVisitor extends KinomoBaseVisitor<Field> {

    private final Scope scope;

    public FieldVisitor(Scope scope) {
        this.scope = scope;
    }

    public Field visitField(@NotNull KinomoParser.FieldContext ctx) {
        Type owner = scope.getClassType();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        String name = ctx.name().getText();
        return new Field(name, owner, type);
    }
}
