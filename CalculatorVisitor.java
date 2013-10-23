// Generated from Calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(@NotNull CalculatorParser.DoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(@NotNull CalculatorParser.MultiplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull CalculatorParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull CalculatorParser.MinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull CalculatorParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#SetVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(@NotNull CalculatorParser.SetVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull CalculatorParser.PowerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ConstantE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantE(@NotNull CalculatorParser.ConstantEContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ToSetVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVar(@NotNull CalculatorParser.ToSetVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ConstantPI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantPI(@NotNull CalculatorParser.ConstantPIContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ChangeSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSign(@NotNull CalculatorParser.ChangeSignContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ToMultOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(@NotNull CalculatorParser.ToMultOrDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ToAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(@NotNull CalculatorParser.ToAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ShowResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowResult(@NotNull CalculatorParser.ShowResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(@NotNull CalculatorParser.DivisionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(@NotNull CalculatorParser.BracesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ToPow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPow(@NotNull CalculatorParser.ToPowContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull CalculatorParser.IntContext ctx);
}