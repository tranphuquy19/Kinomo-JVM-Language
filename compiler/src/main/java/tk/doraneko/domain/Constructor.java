package tk.doraneko.domain;

import tk.doraneko.bytecodegeneration.MethodGenerator;
import tk.doraneko.domain.node.statement.Statement;
import tk.doraneko.domain.scope.FunctionSignature;
import tk.doraneko.domain.type.BultInType;
import tk.doraneko.domain.type.Type;

public class Constructor extends Function {
    public Constructor(FunctionSignature signature, Statement block) {
        super(signature, block);
    }

    @Override
    public Type getReturnType() {
        return BultInType.VOID;
    }

    @Override
    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
