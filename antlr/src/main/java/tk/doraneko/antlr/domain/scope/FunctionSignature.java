package tk.doraneko.antlr.domain.scope;

import tk.doraneko.antlr.domain.expression.FunctionParameter;
import tk.doraneko.antlr.domain.type.Type;

import java.util.Collections;
import java.util.List;

public class FunctionSignature {
    private final String name;
    private final List<FunctionParameter> arguments;
    private final Type returnType;

    public FunctionSignature(String name, List<FunctionParameter> arguments, Type returnType) {
        this.name = name;
        this.arguments = arguments;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Type getReturnType() {
        return returnType;
    }
}
