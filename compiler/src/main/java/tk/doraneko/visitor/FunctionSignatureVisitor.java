package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.KinomoParser.FunctionArgumentContext;
import tk.doraneko.antlr.domain.expression.FunctionParameter;
import tk.doraneko.antlr.domain.scope.FunctionSignature;
import tk.doraneko.antlr.domain.type.Type;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FunctionSignatureVisitor extends KinomoBaseVisitor<FunctionSignature> {
    @Override
    public FunctionSignature visitFunctionDeclaration(@NotNull KinomoParser.FunctionDeclarationContext ctx) {
        TypeVisitor typeVisitor = new TypeVisitor();
        String functionName = ctx.functionName().getText();

        List<KinomoParser.FunctionArgumentContext> argsCtx = ctx.functionArgument();
        List<FunctionParameter> parameters = new ArrayList<>();
        for (int i = 0; i < argsCtx.size(); i++) {
            FunctionArgumentContext argCtx = argsCtx.get(i);
            FunctionParameter functionParameters = new FunctionParameter(argCtx.ID().getText(), argCtx.type().accept(new TypeVisitor()), i);
            parameters.add(functionParameters);
        }
        Type returnType = ctx.type().accept(typeVisitor);
        return new FunctionSignature(functionName, parameters, returnType);
    }
}
