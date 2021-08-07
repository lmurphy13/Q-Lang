%{
	#include <stdio.h>
	#include <string.h>
	#define YYSTYPE double /* double type for yacc stack */

	void yyerror(const char *str) {
		fprintf(stderr, "error: %s\n", str);
	}

	int yywrap() {
		return 1;
	}

	int yylex();

	main() {
		yyparse();
	}
%}
%start Program
%token PLUS
%token MINUS
%token MULT
%token SLASH
%token MOD
%token LPAREN
%token RPAREN
%token LBRACKET
%token RBRACKET
%token LBRACE
%token RBRACE
%token SEMICOLON
%token DOT
%token COMMA
%token ASSIGN
%token EQUALS
%token LTHAN
%token GTHAN
%token LEQUALS
%token GEQUALS
%token BANG
%token NEQUALS
%token FUNC
%token IF
%token ELSE
%token WHILE
%token RETURN
%token BOOLEAN
%token INTEGER
%token FLOAT
%token STRING
%token VOID
%token TRUE
%token FALSE
%token NULL

%left '+' '-'
%left '*' '/' '%'

%% /*** Grammar Rules will go here ***/

Program		: MainFunctionDeclaration FunctionDeclarationList EOF;

FunctionDeclarationList : FunctionDeclarationList FunctionDeclaration;

MainFunctionDeclaration : FUNC INTEGER "main" LPAREN RPAREN LBRACE VariableDeclarationList StatementList RBRACE;

VariableDeclarationList : VariableDeclarationList VariableDeclaration
						|
						;

StatementList : StatementList Statement
			  |
			  ;

VariableDeclaration : Type ID SEMICOLON
					| Type ID ASSIGN Expression SEMICOLON
					;

FunctionDeclaration : FUNC Type ID LPAREN ( Type ID ( COMMA Type ID )* )? RPAREN LBRACE VariableDeclarationList StatementList RETURN Expression SEMICOLON RBRACE;

VoidDeclaration : FUNC VOID ID LPAREN RPAREN LBRACE VariableDeclarationList StatementList RBRACE;

Type : Type
	 | Type LBRACKET Expression RBRACKET
	 | BOOLEAN
	 | INTEGER
	 | FLOAT
	 | STRING
	 | ID
	 ;

Statement : LBRACE StatementList RBRACE
		  | IfStatement
		  | WHILE LPAREN Expression RPAREN Statement
		  | Expression ASSIGN Expression 
		  ;

IfStatement : IF LPAREN Expression RPAREN Statement
			| IF LPAREN Expression RPAREN Statement ELSE Statement
			;