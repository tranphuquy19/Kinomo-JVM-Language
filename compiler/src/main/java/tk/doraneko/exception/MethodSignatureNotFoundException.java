package tk.doraneko.exception;

import tk.doraneko.domain.node.expression.Argument;
import tk.doraneko.domain.scope.Scope;

import java.util.List;

public class MethodSignatureNotFoundException extends RuntimeException {
    public MethodSignatureNotFoundException(Scope scope, String methodName, List<Argument> parameterTypes) {
        super("There is no method '" + methodName + "' with parameters " + parameterTypes);
    }
}
