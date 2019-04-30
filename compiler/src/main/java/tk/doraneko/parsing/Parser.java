package tk.doraneko.parsing;

import tk.doraneko.antlr.KinomoLexer;
import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.domain.CompilationUnit;
import tk.doraneko.parsing.visitor.CompilationUnitVisitor;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath - file containing first ki code file
        KinomoLexer lexer = new KinomoLexer(charStream);  //create lexer (pass ki file to it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        KinomoParser parser = new KinomoParser(tokenStream);

        ANTLRErrorListener errorListener = new KinomoTreeWalkErrorListener(); //KinomoTreeWalkErrorListener - handles parse tree visiting error events
        parser.addErrorListener(errorListener);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
