package tk.doraneko.exception;

import tk.doraneko.domain.node.expression.Argument;
import tk.doraneko.domain.node.expression.Parameter;

import java.util.List;

public class WrongArgumentNameException extends RuntimeException {
    public WrongArgumentNameException(Argument argument, List<Parameter> parameters) {
        super("You are trying to call method with argument name" + argument.getParameterName().get() + " where parameters = " + parameters);
    }
}
