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
	 * Visit a parse tree produced by {@link KinomoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull KinomoParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull KinomoParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull KinomoParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull KinomoParser.FunctionNameContext ctx);

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
	 * Visit a parse tree produced by {@link KinomoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull KinomoParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionParamdefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParamdefaultValue(@NotNull KinomoParser.FunctionParamdefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull KinomoParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull KinomoParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull KinomoParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(@NotNull KinomoParser.FunctionArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull KinomoParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull KinomoParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull KinomoParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull KinomoParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull KinomoParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull KinomoParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link KinomoParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull KinomoParser.ClassTypeContext ctx);
}