package tk.doraneko.exception;

import tk.doraneko.antlr.KinomoParser;
import tk.doraneko.antlr.domain.scope.FunctionSignature;

import java.util.List;

public class BadArgumentsSize extends RuntimeException {
    public BadArgumentsSize(FunctionSignature function, List<KinomoParser.ExpressionContext> calledParameters) {
        super("Bad arguments amount");
    }
}
