package tk.doraneko.domain;

import tk.doraneko.bytecodegeneration.MethodGenerator;
import tk.doraneko.domain.node.expression.Parameter;
import tk.doraneko.domain.node.statement.Statement;
import tk.doraneko.domain.scope.FunctionSignature;
import tk.doraneko.domain.type.Type;

import java.util.Collections;
import java.util.List;

public class Function {

    private final FunctionSignature functionSignature;
    private final Statement rootStatement;


    public Function(FunctionSignature functionSignature, Statement rootStatement) {
        this.functionSignature = functionSignature;
        this.rootStatement = rootStatement;
    }

    public String getName() {
        return functionSignature.getName();
    }

    public List<Parameter> getParameters() {
        return Collections.unmodifiableList(functionSignature.getParameters());
    }

    public Statement getRootStatement() {
        return rootStatement;
    }

    public Type getReturnType() {
        return functionSignature.getReturnType();
    }

    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
