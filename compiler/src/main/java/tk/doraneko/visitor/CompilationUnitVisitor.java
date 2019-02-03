package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.KinomoParser.ClassDeclarationContext;
import tk.doraneko.antlr.domain.global.ClassDeclaration;
import tk.doraneko.antlr.domain.global.CompilationUnit;
import org.antlr.v4.runtime.misc.NotNull;

public class CompilationUnitVisitor extends KinomoBaseVisitor<CompilationUnit> {

    @Override
    public CompilationUnit visitCompilationUnit(@NotNull KinomoParser.CompilationUnitContext ctx) {
        String classsName = ctx.classDeclaration().className().getText();
        ClassVisitor classVisitor = new ClassVisitor();
        ClassDeclarationContext classDeclarationContext = ctx.classDeclaration();
        ClassDeclaration classDeclaration = classDeclarationContext.accept(classVisitor);
        return new CompilationUnit(classDeclaration);
    }
}
