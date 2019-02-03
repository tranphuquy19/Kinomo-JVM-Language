package tk.doraneko.antlr.domain.global;


public class CompilationUnit {

    private ClassDeclaration classDeclaration;

    public CompilationUnit(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public String getClassName() {
        return classDeclaration.getName();
    }
}
