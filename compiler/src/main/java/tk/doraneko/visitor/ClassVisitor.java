package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.domain.classs.Function;
import tk.doraneko.antlr.domain.global.ClassDeclaration;
import tk.doraneko.antlr.domain.global.MetaData;
import tk.doraneko.antlr.domain.scope.FunctionSignature;
import tk.doraneko.antlr.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;


public class ClassVisitor extends KinomoBaseVisitor<ClassDeclaration> {

    private Scope scope;


    public ClassDeclaration visitClassDeclaration(@NotNull KinomoParser.ClassDeclarationContext ctx) {
        String name = ctx.className().getText();
        FunctionSignatureVisitor functionSignatureVisitor = new FunctionSignatureVisitor();
        List<KinomoParser.FunctionContext> methodsCtx = ctx.classBody().function();
        MetaData metaData = new MetaData(ctx.className().getText());
        scope = new Scope(metaData);
        List<FunctionSignature> signatures = methodsCtx.stream()
                .map(method -> method.functionDeclaration().accept(functionSignatureVisitor))
                .peek(scope::addSignature)
                .collect(Collectors.toList());
        List<Function> methods = methodsCtx.stream()
                .map(method -> method.accept(new FunctionVisitor(scope)))
                .collect(Collectors.toList());
        return new ClassDeclaration(name, methods);
    }
}
