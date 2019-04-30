package tk.doraneko.integration

import tk.doraneko.compiler.Compiler
import org.apache.commons.io.FileUtils
import spock.lang.Specification
import spock.lang.Unroll

import java.lang.reflect.Method

class ShouldCompileTest extends Specification {

	private final static helloWorld =
							"""
							HelloWorld {

								start {
									echo "hello world!"
								}
							}
							"""

	private final static loopsCode =
							"""
							Loops {
								start() {
									for i from 3 to 1 {
										metod(i)
									}
								}

								metod(int x) {
									echo x
								}
							}
							"""

	private final static allTypes =
							"""
							AllPrimitiveTypes {
								start() {
									var stringVar = "str"
									var booleanVar = false
									var integerVar = 2745
									var doubleVar = 2343.05

									echo "stringVar=" + stringVar + ", booleanVar=" + booleanVar + ", integerVar=" + integerVar + ", doubleVar=" + doubleVar
									echo 2.5+2.5 + " is the sum of 2.5 and 2.5"
								}
							}
							"""

	private final static defaultParams =
							"""
							DefaultParamTest {
								start() {
									greet("jvm","Kinomo")
									greet("tranphuquy")
								}

								greet (string name,string favouriteLanguage="java") {
									echo "Hello my name is "
									echo name
									echo "and my favourite langugage is "
									echo favouriteLanguage
								}
							}
    						"""
	private final static fields =
							"""
							Fields {

								int field

								start {
									field = 5
									echo field
								}

							}
							"""

	private final static namedParams =
							"""
							NamedParamsTest {

								start {
									createRect(x1->25,x2->-25,y1->50,y2->-50)
								}

								createRect (int x1,int y1,int x2, int y2) {
									echo "Created rect with x1=" + x1 + " y1=" + y1 + " x2=" + x2 + " y2=" + y2
								}
							}
							"""

	private final static sumCalculator =
							"""
								SumCalculator {
									start() {
										var expected = 8
										var actual = sum(3,5)
										if( actual == expected ) {
											echo "test passed"
										} else {
											echo "test failed"
										}
									}


								int sum (int x ,int y) {
									x+y
								}
							}
							"""

	private final static defaultConstructor =
							"""
							DefaultConstructor {

							start() {
							echo "Hey I am 'start' method. I am not static so the default constructor must have been called, even though it is not defined"
							}
							}
							"""

	private final static construcotrWithParams =
							"""
							ConstructorWithParams {

							ConstructorWithParams(int x) {
							echo "Hey I am constructor with parameter x = " + x
							}

							start() {
							var instance = new ConstructorWithParams(5)
							instance.doStuff()
							}

							doStuff {
							echo "doing stuff on ConstructorWithParams instance"
							}
							}
							"""

	private final static parameterLessConsturctor =
							"""
							ParameterLessConstructor {

							ParameterLessConstructor() {
							echo "Hey I am constructor without parameters"
							}

							start() {
							doStuff()
							}

							doStuff {
							echo "doing stuff on ParameterLessConstructor object"
							}
							}
							"""

	private static final equalityTest =
							"""
							EqualitySyntax {

							 start {
								   objectComparisonTest()
								   primitiveComparisonTest()
								   primitiveComparisonTest2()
								   objectComparisonTest2()
							 }

							 primitiveComparisonTest {
								 var a = 3
								 var b = 3

								 echo "Comparing primitive " + a +" and " + b

								 var result = a == b
								 assert(expected -> true , actual -> result)

								 var result = a != b
								 assert(expected -> false , actual -> result)

								 var result = a > b
								 assert(expected -> false , actual -> result)

								 var result = a < b
								 assert(expected -> false , actual -> result)

								 var result = a >= b
								 assert(expected -> true , actual -> result)

								 var result = a <= b
								 assert(expected -> true , actual -> result)
							 }


							 objectComparisonTest() {
								 var a = new java.lang.Integer(3)
								 var b = new java.lang.Integer(3)

								  echo "Comparing integer " + a.toString() +" and " + b.toString()


								 var result = a == b
								 assert(expected -> true , actual -> result)

								 var result = a != b
								 assert(expected -> false , actual -> result)

								 var result = a > b
								 assert(expected -> false , actual -> result)

								 var result = a < b
								 assert(expected -> false , actual -> result)

								 var result = a >= b
								 assert(expected -> true , actual -> result)

								 var result = a <= b
								 assert(expected -> true , actual -> result)
							 }

							 primitiveComparisonTest2 {
								  var a = 3
								  var b = 4

								 echo "Comparing primitive " + a +" and " + b


									var result = a == b
									assert(expected -> false , actual -> result)

									var result = a != b
									assert(expected -> true , actual -> result)

									var result = a > b
									assert(expected -> false , actual -> result)

									var result = a < b
									assert(expected -> true , actual -> result)

									var result = a >= b
									assert(expected -> false , actual -> result)

									var result = a <= b
									assert(expected -> true , actual -> result)
							  }

							 objectComparisonTest2() {
								  var a = new java.lang.Integer(3)
								  var b = new java.lang.Integer(4)

								echo "Comparing integer " + a.toString() +" and " + b.toString()

								  var result = a == b
								  assert(expected -> false , actual -> result)

								  var result = a != b
								  assert(expected -> true , actual -> result)

								  var result = a > b
								  assert(expected -> false , actual -> result)

								  var result = a < b
								  assert(expected -> true , actual -> result)

								  var result = a >= b
								  assert(expected -> false , actual -> result)


								  var result = a <= b
								  assert(actual -> result, expected -> true )
							  }

							  void assert(boolean actual,boolean expected) {
								if (actual == expected) {
									echo "OK"
								}
								else {
									echo "TEST FAILED"
								}
							  }
							}
							"""

	@Unroll
	def "Should Compile and run"() {
		expect:
			def file = new File(filename)
			FileUtils.writeStringToFile(file, code)
			Compiler.main(filename)

			URL u = new File(".").toURL();
			URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
			Class urlClass = URLClassLoader.class;
			Method method = urlClass.getDeclaredMethod("addURL", URL.class);
			method.setAccessible(true);
			method.invoke(urlClassLoader, u) == null;

//			def name = Class.forName(filename.replace(".ki", ""))
//			def method1 = name.getMethod("main", String[].class)
//
//			String[] objs = null
//			MethodUtils.invokeStaticMethod(name,"main",objs);
		where:
			code                     | filename
			helloWorld               | "HelloWorld.ki"
			loopsCode                | "Loops.ki"
			allTypes                 | "AllPrimitiveTypes.ki"
			defaultParams            | "DefaultParamTest.ki"
			fields                   | "Fields.ki"
			namedParams              | "NamedParamsTest.ki"
			sumCalculator            | "SumCalculator.ki"
			defaultConstructor       | "DefaultConstructor.ki"
			parameterLessConsturctor | "ParameterLessConstructor.ki"
			construcotrWithParams    | "ConstructorWithParams.ki"
			equalityTest    | "EqualitySyntax.ki"
	}

}