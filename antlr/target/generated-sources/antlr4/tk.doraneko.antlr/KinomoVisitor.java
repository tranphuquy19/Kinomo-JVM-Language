// Generated from tk.doraneko.antlr\Kinomo.g4 by ANTLR 4.3
package tk.doraneko.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KinomoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KinomoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link KinomoParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedArgumentsList(@NotNull KinomoParser.UnnamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull KinomoParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link KinomoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(@NotNull KinomoParser.ReturnVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull KinomoParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(@NotNull KinomoParser.VariableReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(@NotNull KinomoParser.ForConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull KinomoParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull KinomoParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull KinomoParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(@NotNull KinomoParser.DivideContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(@NotNull KinomoParser.VarReferenceContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link KinomoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(@NotNull KinomoParser.ReturnWithValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull KinomoParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull KinomoParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(@NotNull KinomoParser.MultiplyContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull KinomoParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupercall(@NotNull KinomoParser.SupercallContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull KinomoParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull KinomoParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull KinomoParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(@NotNull KinomoParser.ConstructorCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull KinomoParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link KinomoParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentsList(@NotNull KinomoParser.NamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(@NotNull KinomoParser.NamedArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull KinomoParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(@NotNull KinomoParser.ValueExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull KinomoParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull KinomoParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull KinomoParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull KinomoParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull KinomoParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull KinomoParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull KinomoParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Substract}
	 * labeled alternative in {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstract(@NotNull KinomoParser.SubstractContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull KinomoParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull KinomoParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull KinomoParser.FieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithDefaultValue(@NotNull KinomoParser.ParameterWithDefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull KinomoParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(@NotNull KinomoParser.ParametersListContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull KinomoParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull KinomoParser.ClassTypeContext ctx);
}