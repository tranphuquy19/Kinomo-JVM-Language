package tk.doraneko.bytecodegeneration.statement

import tk.doraneko.bytecodegeneration.expression.ExpressionGenerator
import tk.doraneko.domain.node.expression.Value
import tk.doraneko.domain.node.statement.Assignment
import tk.doraneko.domain.scope.Field
import tk.doraneko.domain.scope.LocalVariable
import tk.doraneko.domain.scope.Scope
import tk.doraneko.domain.type.BultInType
import tk.doraneko.domain.type.ClassType
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import spock.lang.Specification

class AssignmentStatementGeneratorTest extends Specification {

    def "should generate bytecode for local variable if variable for name exists in scope"() {
        given:
            def assignment = new Assignment(varName,assignmentExpression)
            def localVariable = Mock(LocalVariable)
            MethodVisitor methodVisitor = Mock()
            ExpressionGenerator expressionGenerator = Mock()
            Scope scope = Mock()
        when:
            new AssignmentStatementGenerator(methodVisitor,expressionGenerator,scope).generate(assignment)
        then :
            1*scope.isLocalVariableExists(varName) >> true
            1*scope.getLocalVariableIndex(varName) >> 3
            1* scope.getLocalVariable(varName) >> localVariable
            1* localVariable.getType() >> assignmentExpression.getType()
            1*methodVisitor.visitVarInsn(expectedOpcode,3)
        where:
            varName  | assignmentExpression                    | expectedOpcode
            "var"    | new Value(BultInType.INT, "25")         | Opcodes.ISTORE
            "strVar" | new Value(BultInType.STRING, "somestr") | Opcodes.ASTORE
    }

    def "should generate bytecode for assignment if field for name exists in scope but local variable does not"() {
        given:
            def assignment = new Assignment(varName,assignmentExpression)
            def field = new Field(varName, variableOwner, variableType)
            MethodVisitor methodVisitor = Mock()
            ExpressionGenerator expressionGenerator = Mock()
            Scope scope = Mock()
        when:
            new AssignmentStatementGenerator(methodVisitor,expressionGenerator,scope).generate(assignment)
            then :
            1*scope.isLocalVariableExists(varName) >> false
            1*scope.getField(varName) >> field
            1* methodVisitor.visitFieldInsn(Opcodes.PUTFIELD,field.ownerInternalName,field.name,field.type.descriptor)
        where:
            varName     | variableOwner         | variableType      | assignmentExpression
            "var"       | new ClassType("Main") | BultInType.INT    | new Value(BultInType.INT, "25")
            "stringVar" | new ClassType("Main") | BultInType.STRING | new Value(BultInType.STRING, "someString")
    }
}
