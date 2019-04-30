package tk.doraneko.util

import tk.doraneko.antlr.KinomoParser
import tk.doraneko.domain.type.BultInType
import tk.doraneko.domain.type.ClassType
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import spock.lang.Specification

class TypeResolverTest extends Specification {
	def "GetFromTypeName with string"() {
		when:
			def actualType = TypeResolver.getFromTypeName(typeName)

		then:
			actualType.equals(expectedType)

		where:
			typeName            | expectedType
			"java.lang.Integer" | new ClassType("java.lang.Integer")
			"int"               | BultInType.INT
			"boolean"           | BultInType.BOOLEAN
			"java.lang.String"  | BultInType.STRING
			"byte[]"            | BultInType.BYTE_ARR
	}

	def "getFromTypeContext"() {
		given:
			KinomoParser.TypeContext typeContext = Mock(KinomoParser.TypeContext)

		when:
			def actualType = TypeResolver.getFromTypeContext(typeContext)

		then:
			1 * typeContext.getText() >> typeName
			actualType.equals(expectedType)

		where:
			typeName            | expectedType
			"java.lang.Integer" | new ClassType("java.lang.Integer")
			"int"               | BultInType.INT
			"boolean"           | BultInType.BOOLEAN
			"java.lang.String"  | BultInType.STRING
	}

	def "getFromTypeContext where typeContext = null should return VOID"() {
		when:
			def actualType = TypeResolver.getFromTypeContext(null)

		then:
			actualType.equals(BultInType.VOID)
	}

	def "GetFromValue"() {
		given:
			def valueCtx = Mock(KinomoParser.ValueContext)
			def terminalNode = Mock(TerminalNode)
		when:
			def actualType = TypeResolver.getFromValue(valueCtx)

		then:
			1 * valueCtx.NUMBER() >> (contextType == "number" ? terminalNode : null)
			if(contextType != "number") {
				1 * valueCtx.BOOL() >> (contextType == "boolean" ? terminalNode : null)
			}

			1 * valueCtx.getText() >> stringValue
			actualType.equals(expectedType)

		where:
			stringValue | contextType | expectedType
			"true"      | "boolean"   | BultInType.BOOLEAN
			"5.5"       | "number"    | BultInType.FLOAT
			"5"       | "number"    | BultInType.INT
			"something" | "string"    | BultInType.STRING
	}

}
