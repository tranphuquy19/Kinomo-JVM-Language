package tk.doraneko;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import tk.doraneko.antlr.KinomoLexer;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.domain.global.CompilationUnit;
import tk.doraneko.parsing.KinomoTreeWalkErrorListener;
import tk.doraneko.visitor.CompilationUnitVisitor;

import java.io.IOException;


public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath - file containing first enk code file
        KinomoLexer lexer = new KinomoLexer(charStream);  //create lexer (pass enk file to it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        KinomoParser parser = new KinomoParser(tokenStream);

        ANTLRErrorListener errorListener = new KinomoTreeWalkErrorListener();
        parser.addErrorListener(errorListener);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
