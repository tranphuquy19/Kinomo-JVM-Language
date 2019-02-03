package tk.doraneko.bytecodegenerator;


import tk.doraneko.antlr.domain.global.ClassDeclaration;
import tk.doraneko.antlr.domain.global.CompilationUnit;

public class BytecodeGenerator {
    public byte[] generate(CompilationUnit compilationUnit) {
        ClassDeclaration classDeclaration = compilationUnit.getClassDeclaration();
        ClassGenerator classGenerator = new ClassGenerator();
        return classGenerator.generate(classDeclaration).toByteArray();
    }
}
