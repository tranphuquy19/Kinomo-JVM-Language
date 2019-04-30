package tk.doraneko.exception;

import tk.doraneko.domain.node.expression.Call;

public class BadArgumentsToFunctionCallException extends RuntimeException {
    public BadArgumentsToFunctionCallException(Call functionCall) {
        super("You called function with bad arguments " + functionCall);
    }
}
