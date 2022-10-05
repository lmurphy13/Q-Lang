// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNC=1, INT=2, MAIN=3, FLOAT=4, BOOL=5, STRING=6, VOID=7, ASSIGN=8, RETURN=9, 
		IF=10, ELSE=11, WHILE=12, GT=13, LT=14, GE=15, LE=16, NE=17, AND=18, OR=19, 
		EQ=20, PLUS=21, MINUS=22, STAR=23, SLASH=24, MOD=25, BANG=26, LPAREN=27, 
		RPAREN=28, LBRACE=29, RBRACE=30, LBRACK=31, RBRACK=32, COMMA=33, DOT=34, 
		SEMICOLON=35, D_QUOTE=36, TRUE=37, FALSE=38, NUL=39, ID=40, Integer=41, 
		Float=42, StringLiteral=43, Whitespace=44, Newline=45;
	public static final int
		RULE_program = 0, RULE_mainFunctionDecl = 1, RULE_variableDecl = 2, RULE_functionDecl = 3, 
		RULE_voidDecl = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainFunctionDecl", "variableDecl", "functionDecl", "voidDecl", 
			"type", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'int'", "'main'", "'float'", "'bool'", "'string'", "'void'", 
			"':='", "'return'", "'if'", "'else'", "'while'", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'&&'", "'||'", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'.'", "';'", 
			"'\"'", "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNC", "INT", "MAIN", "FLOAT", "BOOL", "STRING", "VOID", "ASSIGN", 
			"RETURN", "IF", "ELSE", "WHILE", "GT", "LT", "GE", "LE", "NE", "AND", 
			"OR", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "MOD", "BANG", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"D_QUOTE", "TRUE", "FALSE", "NUL", "ID", "Integer", "Float", "StringLiteral", 
			"Whitespace", "Newline"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionDeclContext mainFunctionDecl() {
			return getRuleContext(MainFunctionDeclContext.class,0);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainFunctionDecl();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(17);
				functionDecl();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(QParser.FUNC, 0); }
		public TerminalNode INT() { return getToken(QParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(QParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(QParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QParser.RBRACE, 0); }
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunctionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterMainFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitMainFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitMainFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionDeclContext mainFunctionDecl() throws RecognitionException {
		MainFunctionDeclContext _localctx = new MainFunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainFunctionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(FUNC);
			setState(24);
			match(INT);
			setState(25);
			match(MAIN);
			setState(26);
			match(LPAREN);
			setState(27);
			match(RPAREN);
			setState(28);
			match(LBRACE);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(29);
					variableDecl();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17455489487872L) != 0) {
				{
				{
				setState(35);
				statement();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(QParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(QParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			type();
			setState(44);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(45);
				match(ASSIGN);
				setState(46);
				expression(0);
				}
			}

			setState(49);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(QParser.FUNC, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(QParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(QParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(QParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(QParser.RBRACE, 0); }
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QParser.COMMA, i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(FUNC);
			setState(52);
			type();
			setState(53);
			match(ID);
			setState(54);
			match(LPAREN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511627892L) != 0) {
				{
				setState(55);
				type();
				setState(56);
				match(ID);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(57);
					match(COMMA);
					setState(58);
					type();
					setState(59);
					match(ID);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(68);
			match(RPAREN);
			setState(69);
			match(LBRACE);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					variableDecl();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17455489487872L) != 0) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RETURN);
			setState(83);
			expression(0);
			setState(84);
			match(SEMICOLON);
			setState(85);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(QParser.FUNC, 0); }
		public TerminalNode VOID() { return getToken(QParser.VOID, 0); }
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(QParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QParser.RBRACE, 0); }
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VoidDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterVoidDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitVoidDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitVoidDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidDeclContext voidDecl() throws RecognitionException {
		VoidDeclContext _localctx = new VoidDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_voidDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FUNC);
			setState(88);
			match(VOID);
			setState(89);
			match(ID);
			setState(90);
			match(LPAREN);
			setState(91);
			match(RPAREN);
			setState(92);
			match(LBRACE);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					variableDecl();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17455489487872L) != 0) {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(QParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(QParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(QParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(QParser.STRING, 0); }
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(QParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(QParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(QParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(QParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(QParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(QParser.WHILE, 0); }
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(QParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QParser.COMMA, i);
		}
		public TerminalNode ASSIGN() { return getToken(QParser.ASSIGN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(LBRACE);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17455489487872L) != 0) {
					{
					{
					setState(116);
					statement();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(IF);
				setState(124);
				match(LPAREN);
				setState(125);
				expression(0);
				setState(126);
				match(RPAREN);
				setState(127);
				statement();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(128);
					match(ELSE);
					setState(129);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(WHILE);
				setState(133);
				match(LPAREN);
				setState(134);
				expression(0);
				setState(135);
				match(RPAREN);
				setState(136);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(ID);
				setState(139);
				match(LPAREN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454952611840L) != 0) {
					{
					setState(140);
					expression(0);
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(141);
						match(COMMA);
						setState(142);
						expression(0);
						}
						}
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(150);
				match(RPAREN);
				setState(151);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				expression(0);
				setState(153);
				match(ASSIGN);
				setState(154);
				expression(0);
				setState(155);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(QParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BANG() { return getToken(QParser.BANG, 0); }
		public TerminalNode LPAREN() { return getToken(QParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QParser.COMMA, i);
		}
		public TerminalNode Integer() { return getToken(QParser.Integer, 0); }
		public TerminalNode Float() { return getToken(QParser.Float, 0); }
		public TerminalNode StringLiteral() { return getToken(QParser.StringLiteral, 0); }
		public TerminalNode TRUE() { return getToken(QParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(QParser.FALSE, 0); }
		public TerminalNode NUL() { return getToken(QParser.NUL, 0); }
		public TerminalNode OR() { return getToken(QParser.OR, 0); }
		public TerminalNode AND() { return getToken(QParser.AND, 0); }
		public TerminalNode EQ() { return getToken(QParser.EQ, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public TerminalNode LT() { return getToken(QParser.LT, 0); }
		public TerminalNode GE() { return getToken(QParser.GE, 0); }
		public TerminalNode LE() { return getToken(QParser.LE, 0); }
		public TerminalNode NE() { return getToken(QParser.NE, 0); }
		public TerminalNode PLUS() { return getToken(QParser.PLUS, 0); }
		public TerminalNode STAR() { return getToken(QParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(QParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(QParser.MOD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(160);
				match(MINUS);
				setState(161);
				expression(11);
				}
				break;
			case 2:
				{
				setState(162);
				match(BANG);
				setState(163);
				expression(10);
				}
				break;
			case 3:
				{
				setState(164);
				match(LPAREN);
				setState(165);
				expression(0);
				setState(166);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(168);
				match(ID);
				setState(169);
				match(LPAREN);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454952611840L) != 0) {
					{
					setState(170);
					expression(0);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(171);
						match(COMMA);
						setState(172);
						expression(0);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(180);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(181);
				match(ID);
				}
				break;
			case 6:
				{
				setState(182);
				match(Integer);
				}
				break;
			case 7:
				{
				setState(183);
				match(Float);
				}
				break;
			case 8:
				{
				setState(184);
				match(StringLiteral);
				}
				break;
			case 9:
				{
				setState(185);
				match(TRUE);
				}
				break;
			case 10:
				{
				setState(186);
				match(FALSE);
				}
				break;
			case 11:
				{
				setState(187);
				match(NUL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(191);
						match(OR);
						setState(192);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(194);
						match(AND);
						setState(195);
						expression(24);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(197);
						match(EQ);
						setState(198);
						expression(23);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(200);
						match(GT);
						setState(201);
						expression(22);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(203);
						match(LT);
						setState(204);
						expression(21);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(206);
						match(GE);
						setState(207);
						expression(20);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(209);
						match(LE);
						setState(210);
						expression(19);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(212);
						match(NE);
						setState(213);
						expression(18);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(215);
						match(PLUS);
						setState(216);
						expression(17);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(218);
						match(MINUS);
						setState(219);
						expression(16);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(221);
						match(STAR);
						setState(222);
						expression(15);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(224);
						match(SLASH);
						setState(225);
						expression(14);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(227);
						match(MOD);
						setState(228);
						expression(13);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0005\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003>\b\u0003\n\u0003\f\u0003A\t\u0003\u0003\u0003C\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003"+
		"K\t\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0004\u0005\u0004e\b\u0004"+
		"\n\u0004\f\u0004h\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005r\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006v\b\u0006\n\u0006\f\u0006y\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n\u0006"+
		"\f\u0006\u0093\t\u0006\u0003\u0006\u0095\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u009e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ae\b\u0007\n\u0007"+
		"\f\u0007\u00b1\t\u0007\u0003\u0007\u00b3\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00e6\b\u0007\n\u0007\f\u0007\u00e9\t\u0007\u0001\u0007\u0000\u0001\u000e"+
		"\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000\u0112\u0000\u0010\u0001"+
		"\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004+\u0001\u0000"+
		"\u0000\u0000\u00063\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000"+
		"\nq\u0001\u0000\u0000\u0000\f\u009d\u0001\u0000\u0000\u0000\u000e\u00bc"+
		"\u0001\u0000\u0000\u0000\u0010\u0014\u0003\u0002\u0001\u0000\u0011\u0013"+
		"\u0003\u0006\u0003\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0016"+
		"\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0001\u0000\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018\u0019"+
		"\u0005\u0002\u0000\u0000\u0019\u001a\u0005\u0003\u0000\u0000\u001a\u001b"+
		"\u0005\u001b\u0000\u0000\u001b\u001c\u0005\u001c\u0000\u0000\u001c \u0005"+
		"\u001d\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!&\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000#%\u0003\f\u0006\u0000$#\u0001\u0000\u0000\u0000%(\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u001e\u0000"+
		"\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0003\n\u0005\u0000,/\u0005(\u0000"+
		"\u0000-.\u0005\b\u0000\u0000.0\u0003\u000e\u0007\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005#\u0000"+
		"\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0003"+
		"\n\u0005\u000056\u0005(\u0000\u00006B\u0005\u001b\u0000\u000078\u0003"+
		"\n\u0005\u00008?\u0005(\u0000\u00009:\u0005!\u0000\u0000:;\u0003\n\u0005"+
		"\u0000;<\u0005(\u0000\u0000<>\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000B7\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DE\u0005\u001c\u0000\u0000EI\u0005\u001d\u0000\u0000FH\u0003\u0004\u0002"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JO\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LN\u0003\f\u0006\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\t\u0000\u0000"+
		"ST\u0003\u000e\u0007\u0000TU\u0005#\u0000\u0000UV\u0005\u001e\u0000\u0000"+
		"V\u0007\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0005\u0007"+
		"\u0000\u0000YZ\u0005(\u0000\u0000Z[\u0005\u001b\u0000\u0000[\\\u0005\u001c"+
		"\u0000\u0000\\`\u0005\u001d\u0000\u0000]_\u0003\u0004\u0002\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000af\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ce\u0003\f\u0006\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u001e\u0000\u0000j\t\u0001"+
		"\u0000\u0000\u0000kr\u0001\u0000\u0000\u0000lr\u0005\u0005\u0000\u0000"+
		"mr\u0005\u0002\u0000\u0000nr\u0005\u0004\u0000\u0000or\u0005\u0006\u0000"+
		"\u0000pr\u0005(\u0000\u0000qk\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000"+
		"\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000r\u000b\u0001\u0000\u0000\u0000"+
		"sw\u0005\u001d\u0000\u0000tv\u0003\f\u0006\u0000ut\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z\u009e\u0005"+
		"\u001e\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005\u001b\u0000\u0000}~\u0003"+
		"\u000e\u0007\u0000~\u007f\u0005\u001c\u0000\u0000\u007f\u0082\u0003\f"+
		"\u0006\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u0083\u0003\f\u0006"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u009e\u0001\u0000\u0000\u0000\u0084\u0085\u0005\f\u0000\u0000"+
		"\u0085\u0086\u0005\u001b\u0000\u0000\u0086\u0087\u0003\u000e\u0007\u0000"+
		"\u0087\u0088\u0005\u001c\u0000\u0000\u0088\u0089\u0003\f\u0006\u0000\u0089"+
		"\u009e\u0001\u0000\u0000\u0000\u008a\u008b\u0005(\u0000\u0000\u008b\u0094"+
		"\u0005\u001b\u0000\u0000\u008c\u0091\u0003\u000e\u0007\u0000\u008d\u008e"+
		"\u0005!\u0000\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u008c\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u009e\u0005"+
		"#\u0000\u0000\u0098\u0099\u0003\u000e\u0007\u0000\u0099\u009a\u0005\b"+
		"\u0000\u0000\u009a\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0005#\u0000"+
		"\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009ds\u0001\u0000\u0000\u0000"+
		"\u009d{\u0001\u0000\u0000\u0000\u009d\u0084\u0001\u0000\u0000\u0000\u009d"+
		"\u008a\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009e"+
		"\r\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\u0007\uffff\uffff\u0000\u00a0"+
		"\u00a1\u0005\u0016\u0000\u0000\u00a1\u00bd\u0003\u000e\u0007\u000b\u00a2"+
		"\u00a3\u0005\u001a\u0000\u0000\u00a3\u00bd\u0003\u000e\u0007\n\u00a4\u00a5"+
		"\u0005\u001b\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0000\u00a6\u00a7"+
		"\u0005\u001c\u0000\u0000\u00a7\u00bd\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005(\u0000\u0000\u00a9\u00b2\u0005\u001b\u0000\u0000\u00aa\u00af\u0003"+
		"\u000e\u0007\u0000\u00ab\u00ac\u0005!\u0000\u0000\u00ac\u00ae\u0003\u000e"+
		"\u0007\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00bd\u0005\u001c"+
		"\u0000\u0000\u00b5\u00bd\u0005(\u0000\u0000\u00b6\u00bd\u0005)\u0000\u0000"+
		"\u00b7\u00bd\u0005*\u0000\u0000\u00b8\u00bd\u0005+\u0000\u0000\u00b9\u00bd"+
		"\u0005%\u0000\u0000\u00ba\u00bd\u0005&\u0000\u0000\u00bb\u00bd\u0005\'"+
		"\u0000\u0000\u00bc\u009f\u0001\u0000\u0000\u0000\u00bc\u00a2\u0001\u0000"+
		"\u0000\u0000\u00bc\u00a4\u0001\u0000\u0000\u0000\u00bc\u00a8\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00e7\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\n\u0018\u0000\u0000\u00bf\u00c0\u0005\u0013\u0000"+
		"\u0000\u00c0\u00e6\u0003\u000e\u0007\u0019\u00c1\u00c2\n\u0017\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0012\u0000\u0000\u00c3\u00e6\u0003\u000e\u0007\u0018"+
		"\u00c4\u00c5\n\u0016\u0000\u0000\u00c5\u00c6\u0005\u0014\u0000\u0000\u00c6"+
		"\u00e6\u0003\u000e\u0007\u0017\u00c7\u00c8\n\u0015\u0000\u0000\u00c8\u00c9"+
		"\u0005\r\u0000\u0000\u00c9\u00e6\u0003\u000e\u0007\u0016\u00ca\u00cb\n"+
		"\u0014\u0000\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00e6\u0003"+
		"\u000e\u0007\u0015\u00cd\u00ce\n\u0013\u0000\u0000\u00ce\u00cf\u0005\u000f"+
		"\u0000\u0000\u00cf\u00e6\u0003\u000e\u0007\u0014\u00d0\u00d1\n\u0012\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0010\u0000\u0000\u00d2\u00e6\u0003\u000e\u0007"+
		"\u0013\u00d3\u00d4\n\u0011\u0000\u0000\u00d4\u00d5\u0005\u0011\u0000\u0000"+
		"\u00d5\u00e6\u0003\u000e\u0007\u0012\u00d6\u00d7\n\u0010\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0015\u0000\u0000\u00d8\u00e6\u0003\u000e\u0007\u0011\u00d9"+
		"\u00da\n\u000f\u0000\u0000\u00da\u00db\u0005\u0016\u0000\u0000\u00db\u00e6"+
		"\u0003\u000e\u0007\u0010\u00dc\u00dd\n\u000e\u0000\u0000\u00dd\u00de\u0005"+
		"\u0017\u0000\u0000\u00de\u00e6\u0003\u000e\u0007\u000f\u00df\u00e0\n\r"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0018\u0000\u0000\u00e1\u00e6\u0003\u000e"+
		"\u0007\u000e\u00e2\u00e3\n\f\u0000\u0000\u00e3\u00e4\u0005\u0019\u0000"+
		"\u0000\u00e4\u00e6\u0003\u000e\u0007\r\u00e5\u00be\u0001\u0000\u0000\u0000"+
		"\u00e5\u00c1\u0001\u0000\u0000\u0000\u00e5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00e5\u00c7\u0001\u0000\u0000\u0000\u00e5\u00ca\u0001\u0000\u0000\u0000"+
		"\u00e5\u00cd\u0001\u0000\u0000\u0000\u00e5\u00d0\u0001\u0000\u0000\u0000"+
		"\u00e5\u00d3\u0001\u0000\u0000\u0000\u00e5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00d9\u0001\u0000\u0000\u0000\u00e5\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e5\u00df\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u000f\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u0015\u0014 &/?BIO`fqw\u0082\u0091"+
		"\u0094\u009d\u00af\u00b2\u00bc\u00e5\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}