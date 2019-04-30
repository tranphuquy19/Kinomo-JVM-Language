package tk.doraneko.parsing.visitor

import tk.doraneko.antlr.KinomoParser
import tk.doraneko.domain.scope.Scope
import tk.doraneko.domain.type.BultInType
import tk.doraneko.domain.type.ClassType
import spock.lang.Specification

class FieldVisitorTest extends Specification {
    def "should create Field object from antlr generated FieldContext object"() {
        given:
            KinomoParser.FieldContext fieldContext = Mock()
            KinomoParser.NameContext nameContext = Mock()
            KinomoParser.TypeContext typeContext = Mock()
            Scope scope = Mock()
        when:
            def field = new FieldVisitor(scope).visitField(fieldContext)
        then:
            field.ownerInternalName == expectedOwnerInternalName;
            field.type == expectedType;
            field.name == name;
            1* scope.getClassType() >> new ClassType("Main")
            1* nameContext.getText() >> name
            1* fieldContext.name() >> nameContext
            1* fieldContext.type() >> typeContext
            1* typeContext.getText() >> typeName
        where:
        name        | typeName            | expectedType                       | expectedOwnerInternalName
        "var"       | "int"               | BultInType.INT                     | "Main"
        "otherVar"  | "string"            | BultInType.STRING                  | "Main"
        "stringVar" | "java.lang.String"  | BultInType.STRING                  | "Main"
        "objVar"    | "java.lang.Integer" | new ClassType("java.lang.Integer") | "Main"
    }
}
