// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QParser}.
 */
public interface QListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#mainFunctionDecl}.
	 * @param ctx the parse tree
	 */
	void enterMainFunctionDecl(QParser.MainFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#mainFunctionDecl}.
	 * @param ctx the parse tree
	 */
	void exitMainFunctionDecl(QParser.MainFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(QParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(QParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(QParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(QParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#voidDecl}.
	 * @param ctx the parse tree
	 */
	void enterVoidDecl(QParser.VoidDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#voidDecl}.
	 * @param ctx the parse tree
	 */
	void exitVoidDecl(QParser.VoidDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(QParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(QParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QParser.ExpressionContext ctx);
}