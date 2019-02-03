package tk.doraneko.bytecodegenerator;

import tk.doraneko.antlr.domain.expression.*;
import tk.doraneko.antlr.domain.expression.FunctionParameter;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.type.BultInType;
import tk.doraneko.antlr.domain.type.ClassType;
import tk.doraneko.antlr.domain.type.Type;
import tk.doraneko.exception.CalledFunctionDoesNotExistException;
import tk.doraneko.utils.DescriptorFactory;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Optional;


public class ExpressionGenrator {


    private MethodVisitor methodVisitor;

    public ExpressionGenrator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }

    public void generate(Expression expression, Scope scope) {
        if (expression instanceof Identifier) {
            Identifier identifier = (Identifier) expression;
            generate(identifier,scope);
        }
        if(expression instanceof Value) {
            Value value = (Value) expression;
            generate(value,scope);
        } else if(expression instanceof FunctionCall) {
            FunctionCall functionCall = (FunctionCall) expression;
            generate(functionCall,scope);
        } else if(expression instanceof FunctionParameter) {
            FunctionParameter parameter = (FunctionParameter) expression;
            generate(parameter,scope);
        }
    }

    public void generate(Identifier identifier,Scope scope) {
        Expression expression = scope.getIdentifier(identifier.getName()).getExpression();
        generate(expression,scope);
    }

    public void generate(FunctionParameter parameter, Scope scope) {
        Type type = parameter.getType();
        if(type == BultInType.INT) {
            methodVisitor.visitVarInsn(Opcodes.ILOAD,parameter.getIndex());
        }
    }

    public void generate(Value value, Scope scope) {
        Type type = value.getType();
        String stringValue = value.getValue();
        if (type == BultInType.INT) {
            int intValue = Integer.parseInt(stringValue);
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, intValue);
        } else if (type == BultInType.STRING) {
            methodVisitor.visitLdcInsn(stringValue);
        }
    }

    public void generate(FunctionCall functionCall, Scope scope) {
        Collection<Expression> parameters = functionCall.getParameters();
        parameters.forEach(param -> generate(param, scope));
        Type owner = functionCall.getOwner().orElse(new ClassType(scope.getClassName()));
        String methodDescriptor = getFunctionDescriptor(functionCall,scope);
        String ownerDescriptor = owner.getInternalName();
        String functionName = functionCall.getFunctionName();
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, ownerDescriptor, functionName, methodDescriptor, false);
    }

    private String getFunctionDescriptor(FunctionCall functionCall, Scope scope) {
        return Optional.of(getDescriptorForFunctionInScope(functionCall, scope))
                .orElse(getDescriptorForFunctionOnClasspath(functionCall, scope))
                .orElseThrow(() -> new CalledFunctionDoesNotExistException(functionCall,scope));
    }


    private Optional<String> getDescriptorForFunctionInScope(FunctionCall functionCall, Scope scope) {
        return Optional.ofNullable(DescriptorFactory.getMethodDescriptor(functionCall.getSignature()));
    }

    private Optional<String> getDescriptorForFunctionOnClasspath(FunctionCall functionCall, Scope scope) {
            try {
                String functionName = functionCall.getFunctionName();
                Collection<Expression> parameters = functionCall.getParameters();
                Optional<Type> owner = functionCall.getOwner();
                String className = owner.isPresent() ? owner.get().getName() : scope.getClassName();
                Class<?> aClass = Class.forName(className);
                Method method = aClass.getMethod(functionName);
                String methodDescriptor = org.objectweb.asm.Type.getMethodDescriptor(method);
                return Optional.of(methodDescriptor);
            } catch (ReflectiveOperationException e) {
                return Optional.empty();
            }
    }
}
