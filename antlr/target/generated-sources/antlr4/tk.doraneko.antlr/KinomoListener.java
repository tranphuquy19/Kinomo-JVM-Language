// Generated from tk.doraneko.antlr\Kinomo.g4 by ANTLR 4.3
package tk.doraneko.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KinomoParser}.
 */
public interface KinomoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KinomoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull KinomoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KinomoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull KinomoParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link KinomoParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull KinomoParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KinomoParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull KinomoParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link KinomoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull KinomoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KinomoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull KinomoParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link KinomoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull KinomoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KinomoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull KinomoParser.ValueContext ctx);
}