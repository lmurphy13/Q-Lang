// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#mainFunctionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunctionDecl(QParser.MainFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(QParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(QParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#voidDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidDecl(QParser.VoidDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(QParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QParser.ExpressionContext ctx);
}