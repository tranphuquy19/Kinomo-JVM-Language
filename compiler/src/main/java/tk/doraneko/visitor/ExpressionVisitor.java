package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.domain.expression.Expression;
import tk.doraneko.antlr.domain.expression.FunctionCall;
import tk.doraneko.antlr.domain.expression.FunctionParameter;
import tk.doraneko.antlr.domain.expression.Value;
import tk.doraneko.antlr.domain.scope.FunctionSignature;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.type.Type;
import tk.doraneko.exception.BadArgumentsSize;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ExpressionVisitor extends KinomoBaseVisitor<Expression> {

    private Scope scope;

    public ExpressionVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Expression visitIdentifier(@NotNull KinomoParser.IdentifierContext ctx) {
        return scope.getIdentifier(ctx.getText());
    }

    @Override
    public Expression visitValue(@NotNull KinomoParser.ValueContext ctx) {
        String value = ctx.getText();
        TypeVisitor typeVisitor = new TypeVisitor();
        Type type = ctx.accept(typeVisitor);
        return new Value(type, value);
    }

    @Override
    public Expression visitFunctionCall(@NotNull KinomoParser.FunctionCallContext ctx) {

        String funName = ctx.functionName().getText();
        FunctionSignature functionSignature = scope.getSignatureForName(funName);
        List<FunctionParameter> functionPArameters = functionSignature.getArguments();
        List<KinomoParser.ExpressionContext> calledParameters = ctx.expressionList().expression();
        if(functionPArameters.size() != calledParameters.size()) {
            throw new BadArgumentsSize(functionSignature,calledParameters);
        }
        for(int i = 0; i< functionPArameters.size(); i++) {
            List<Expression> parameters = new ArrayList<>();
            FunctionParameter formalParam = functionPArameters.get(i);
            KinomoParser.ExpressionContext actualParam = calledParameters.get(i);

            ExpressionVisitor visitor = new ExpressionVisitor(scope);
            Expression parameter = actualParam.accept(visitor);
        }
        List<Expression> arguments = calledParameters.stream()
                .map((expressionContext) -> {
                    int paramIndex = calledParameters.indexOf(expressionContext);
                    Type paramType = functionPArameters.get(paramIndex).getType();
                    return expressionContext.accept(new ExpressionVisitor(scope));
                })
                .collect(Collectors.toList());
        Type returnType = functionSignature.getReturnType();
        return new FunctionCall(functionSignature, arguments,null);
    }
}
