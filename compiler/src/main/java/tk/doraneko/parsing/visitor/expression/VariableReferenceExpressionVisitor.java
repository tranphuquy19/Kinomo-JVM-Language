package tk.doraneko.parsing.visitor.expression;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.VarReferenceContext;
import tk.doraneko.domain.node.expression.FieldReference;
import tk.doraneko.domain.node.expression.LocalVariableReference;
import tk.doraneko.domain.node.expression.Reference;
import tk.doraneko.domain.scope.Field;
import tk.doraneko.domain.scope.LocalVariable;
import tk.doraneko.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

public class VariableReferenceExpressionVisitor extends KinomoBaseVisitor<Reference> {
    private final Scope scope;

    public VariableReferenceExpressionVisitor(Scope scope) {
        this.scope = scope;
    }

    public Reference visitVarReference(@NotNull VarReferenceContext ctx) {
        String varName = ctx.getText();
        if(scope.isFieldExists(varName)) {
            Field field = scope.getField(varName);
            return new FieldReference(field);
        }
        LocalVariable variable = scope.getLocalVariable(varName);
        return new LocalVariableReference(variable);
    }
}