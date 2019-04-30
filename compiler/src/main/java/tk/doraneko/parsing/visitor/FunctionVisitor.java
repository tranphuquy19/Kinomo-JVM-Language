package tk.doraneko.parsing.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.BlockContext;
import tk.doraneko.antlr.KinomoParser.FunctionContext;
import tk.doraneko.domain.Constructor;
import tk.doraneko.domain.Function;
import tk.doraneko.domain.node.statement.Statement;
import tk.doraneko.domain.scope.FunctionSignature;
import tk.doraneko.domain.scope.LocalVariable;
import tk.doraneko.domain.scope.Scope;
import tk.doraneko.parsing.visitor.statement.StatementVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class FunctionVisitor extends KinomoBaseVisitor<Function> {

    private final Scope scope;

    public FunctionVisitor(Scope scope) {
        this.scope = new Scope(scope);
    }

    public Function visitFunction(@NotNull FunctionContext ctx) {
        FunctionSignature signature = ctx.functionDeclaration().accept(new FunctionSignatureVisitor(scope));
        scope.addLocalVariable(new LocalVariable("this",scope.getClassType()));
        addParametersAsLocalVariables(signature);
        Statement block = getBlock(ctx);
        if(signature.getName().equals(scope.getClassName())) {
            return new Constructor(signature,block);
        }
        return new Function(signature, block);
    }

    private void addParametersAsLocalVariables(FunctionSignature signature) {
        signature.getParameters().stream()
                .forEach(param -> scope.addLocalVariable(new LocalVariable(param.getName(), param.getType())));
    }

    private Statement getBlock(FunctionContext functionContext) {
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        BlockContext block = functionContext.block();
        return block.accept(statementVisitor);
    }
}
