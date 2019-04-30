package tk.doraneko.util

import tk.doraneko.domain.Function
import tk.doraneko.domain.node.expression.Parameter
import tk.doraneko.domain.scope.FunctionSignature
import tk.doraneko.domain.type.BultInType
import tk.doraneko.domain.type.ClassType

class DescriptorFactoryTest extends spock.lang.Specification {
    def "test descriptor factory with function"() {
        given:
            Function function = Mock(Function)
            Parameter param = new Parameter("param", paramType,Optional.empty())

        when:
            def descr = DescriptorFactory.getMethodDescriptor(function)

        then:
            1 * function.getParameters() >> [param]
            1 * function.getReturnType() >> retType

        expect: "function descriptor should be equal to the expected"
            descr.equals(descriptor)

        where:
            paramType                         | retType           | descriptor
            BultInType.INT                    | BultInType.INT    | "(I)I"
            BultInType.STRING                 | BultInType.STRING | "(Ljava/lang/String;)Ljava/lang/String;"
            new ClassType("java.lang.String") | BultInType.INT    | "(Ljava/lang/String;)I"
    }

    def "test descriptor factory with signature"() {
        given:
            Parameter param = new Parameter("param", paramType,Optional.empty())
            FunctionSignature signature = Mock(FunctionSignature)

        when:
            def descr = DescriptorFactory.getMethodDescriptor(signature)

        then:
            1 * signature.getParameters() >> [param]
            1 * signature.getReturnType() >> retType

        expect: "function descriptor should be equal to the expected"
            descr.equals(descriptor)

        where:
            paramType                         | retType           | descriptor
            BultInType.INT                    | BultInType.INT    | "(I)I"
            BultInType.STRING                 | BultInType.STRING | "(Ljava/lang/String;)Ljava/lang/String;"
            new ClassType("java.lang.String") | BultInType.INT    | "(Ljava/lang/String;)I"
    }
}
