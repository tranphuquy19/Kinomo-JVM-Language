package tk.doraneko.parsing.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ClassDeclarationContext;
import tk.doraneko.antlr.KinomoParser.CompilationUnitContext;
import tk.doraneko.domain.ClassDeclaration;
import tk.doraneko.domain.CompilationUnit;
import org.antlr.v4.runtime.misc.NotNull;

public class CompilationUnitVisitor extends KinomoBaseVisitor<CompilationUnit> {

    public CompilationUnit visitCompilationUnit(@NotNull CompilationUnitContext ctx) {
        ClassVisitor classVisitor = new ClassVisitor();
        ClassDeclarationContext classDeclarationContext = ctx.classDeclaration();
        ClassDeclaration classDeclaration = classDeclarationContext.accept(classVisitor);
        return new CompilationUnit(classDeclaration);
    }
}
