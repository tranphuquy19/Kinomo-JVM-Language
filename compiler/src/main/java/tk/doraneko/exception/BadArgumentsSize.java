package tk.doraneko.exception;

import tk.doraneko.antlr.KinomoParser.ExpressionContext;
import tk.doraneko.domain.scope.FunctionSignature;

import java.util.List;

public class BadArgumentsSize extends RuntimeException {
    public BadArgumentsSize(FunctionSignature function, List<ExpressionContext> calledParameters) {
        super("Bad arguments amount");
    }
}
