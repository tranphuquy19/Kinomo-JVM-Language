package tk.doraneko.exception;

import tk.doraneko.domain.scope.FunctionSignature;

public class MethodWithNameAlreadyDefinedException extends RuntimeException {
    public MethodWithNameAlreadyDefinedException(FunctionSignature signature) {
        super("Method already defined in scope :" + signature);
    }
}
