package tk.doraneko.parsing.visitor.statement

import tk.doraneko.antlr.KinomoParser
import tk.doraneko.domain.node.expression.EmptyExpression
import tk.doraneko.domain.node.expression.Value
import tk.doraneko.domain.type.BultInType
import tk.doraneko.parsing.visitor.expression.ExpressionVisitor
import spock.lang.Specification

class AssignmentStatementVisitorTest extends Specification {

    def "should create Assignment Object from antlr generated AssignmentContext object"() {
        given:
            KinomoParser.AssignmentContext assignmentContext = Mock()
            KinomoParser.NameContext nameContext = Mock()
            KinomoParser.ExpressionContext expressionContext = Mock()
            ExpressionVisitor expressionVisitor = Mock()
        when:
            def assignment = new AssignmentStatementVisitor(expressionVisitor).visitAssignment(assignmentContext)
        then:
            1* assignmentContext.expression() >> expressionContext
            1* assignmentContext.name() >> nameContext
            1* nameContext.getText() >> name
            1* expressionContext.accept(expressionVisitor) >> expression

            assignment.expression == expression
            assignment.varName == name
        where:
            name | expression
            "cos" | new EmptyExpression(BultInType.VOID)
            "int assignment" | new Value(BultInType.INT,"255")
    }
}
