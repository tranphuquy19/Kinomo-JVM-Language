package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.KinomoParser.FunctionContext;
import tk.doraneko.antlr.KinomoParser.TypeContext;
import tk.doraneko.antlr.domain.classs.Function;
import tk.doraneko.antlr.domain.expression.FunctionParameter;
import tk.doraneko.antlr.domain.expression.Identifier;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.statement.Statement;
import tk.doraneko.antlr.domain.type.Type;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;


public class FunctionVisitor extends KinomoBaseVisitor<Function> {

    private Scope scope;
    public FunctionVisitor(Scope scope) {
        this.scope = new Scope(scope);
    }

    @Override
    public Function visitFunction(@NotNull KinomoParser.FunctionContext ctx) {
        String name = getName(ctx);
        Type returnType = getReturnType(ctx);
        List<FunctionParameter> arguments = getArguments(ctx);
        List<Statement> instructions = getStatements(ctx);
        return new Function(scope,name,returnType,arguments,instructions);
    }

    private String getName(FunctionContext functionDeclarationContext) {
        return functionDeclarationContext.functionDeclaration().functionName().getText();
    }

    private Type getReturnType(FunctionContext functionDeclarationContext) {
        TypeContext typeCtx = functionDeclarationContext.functionDeclaration().type();
        TypeVisitor typeVisitor = new TypeVisitor();
        return typeCtx.accept(typeVisitor);
    }

    private List<FunctionParameter> getArguments(FunctionContext functionDeclarationContext) {
        List<KinomoParser.FunctionArgumentContext> argsCtx = functionDeclarationContext.functionDeclaration().functionArgument();
        List<FunctionParameter> parameters = argsCtx.stream()
                .map(paramCtx -> new FunctionParameter(paramCtx.ID().getText(), paramCtx.type().accept(new TypeVisitor()), paramCtx.index))
                .peek(param -> scope.addIdentifier(new Identifier(param.getName(), param)))
                .collect(Collectors.toList());
        return parameters;
    }

    private List<Statement> getStatements(@NotNull FunctionContext ctx) {
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        CompositeVisitor<Statement> compositeVisitor = new CompositeVisitor<>(statementVisitor, expressionVisitor);
        return ctx.blockStatement().stream()
                    .map(compositeVisitor::accept)
                    .collect(Collectors.toList());
    }
}
