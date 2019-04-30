package tk.doraneko.parsing.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.FunctionDeclarationContext;
import tk.doraneko.antlr.KinomoParser.ParametersListContext;
import tk.doraneko.domain.node.expression.Parameter;
import tk.doraneko.domain.scope.FunctionSignature;
import tk.doraneko.domain.scope.Scope;
import tk.doraneko.domain.type.Type;
import tk.doraneko.parsing.visitor.expression.ExpressionVisitor;
import tk.doraneko.parsing.visitor.expression.function.ParameterExpressionListVisitor;
import tk.doraneko.util.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.List;

public class FunctionSignatureVisitor extends KinomoBaseVisitor<FunctionSignature> {

    private final ExpressionVisitor expressionVisitor;

    public FunctionSignatureVisitor(Scope scope) {
        this.expressionVisitor = new ExpressionVisitor(scope);
    }

    public FunctionSignature visitFunctionDeclaration(@NotNull FunctionDeclarationContext ctx) {
        String functionName = ctx.functionName().getText();
        Type returnType = TypeResolver.getFromTypeContext(ctx.type());
        ParametersListContext parametersCtx = ctx.parametersList();
        if(parametersCtx != null) {
            List<Parameter> parameters = parametersCtx.accept(new ParameterExpressionListVisitor(expressionVisitor));
            return new FunctionSignature(functionName, parameters, returnType);
        }
        return new FunctionSignature(functionName, Collections.emptyList(), returnType);

    }
}
