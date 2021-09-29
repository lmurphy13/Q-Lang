%{
	#include <stdio.h>
	#include <string.h>
	#include "node.h"
	#define YYSTYPE double /* double type for yacc stack */

	NBlock *programBlock;	/* top level root node of AST */

	void yyerror(const char *str) {
		fprintf(stderr, "error: %s\n", str);
	}

	int yywrap() {
		return 1;
	}

	extern int yylex();
%}

%union {
	Node *node;
	NBlock *block;
	NExpression *expr;
	NStatement *stmt;
	NIdentifier *ident;
	NVariableDeclaration *varDecl;
	std::vector<NVariableDeclaration*> *varVec;
	std::vector<NExpression*> *exprVec;
	std::vector<NStatement*> *stmtVec;
	int token;
}

%token <string> TID TFLOAT TINTEGER TBOOLEAN TSTRING
%token <token> PLUS
%token <token> MINUS
%token <token> STAR
%token <token> SLASH
%token <token> PERCENT
%token <token> LPAREN
%token <token> RPAREN
%token <token> LBRACKET
%token <token> RBRACKET
%token <token> LBRACE
%token <token> RBRACE
%token <token> SEMICOLON
%token <token> DOT
%token <token> COMMA
%token <token> ASSIGN
%token <token> EQUAL
%token <token> LTHAN
%token <token> GTHAN
%token <token> LEQUALS
%token <token> GEQUALS
%token <token> BANG
%token <token> NEQUALS
%token <token> AND
%token <token> OR
%token <token> FUNC
%token <token> IF
%token <token> ELSE
%token <token> WHILE
%token <token> RETURN
%token <token> NULL;
%token <token> VOID;
%token <token> EOF;

%left PLUS MINUS
%left STAR SLASH PERCENT

%start Program

%% /*** Grammar Rules will go here ***/

Program	: MainFunctionDeclaration FunctionDeclarationList EOF { programBlock = $1; programBlock->statements = $2; }

FunctionDeclarationList : FunctionDeclarationList FunctionDeclaration;
						| 
						;

MainFunctionDeclaration : FUNC "int" "main" LPAREN RPAREN LBRACE VariableDeclarationList StatementList RBRACE;

VariableDeclarationList : VariableDeclarationList VariableDeclaration
						|
						;

StatementList : Statement { $$ = new NBlock(); $$->statements.push_back($<Statement>1); }
			  | StatementList Statement { $1->statements.push_back($<Statement>2); }
			  ;

VariableDeclaration : Type TID SEMICOLON
					| Type TID ASSIGN Expression SEMICOLON
					;

FunctionDeclaration : FUNC Type TID LPAREN RPAREN LBRACE VariableDeclarationList StatementList RETURN Expression SEMICOLON RBRACE
					| FUNC Type TID LPAREN Type TID COMMA TypeList RPAREN LBRACE VariableDeclarationList StatementList RETURN Expression SEMICOLON RBRACE
					| FUNC Type TID LPAREN Type TID RPAREN LBRACE VariableDeclarationList StatementList RETURN Expression SEMICOLON RBRACE
					;

TypeList : COMMA TypeList Type
		 | COMMA Type
		 ;

VoidDeclaration : FUNC VOID TID LPAREN RPAREN LBRACE VariableDeclarationList StatementList RBRACE;

Type : Type
	 | Type LBRACKET Expression RBRACKET
	 | TBOOLEAN
	 | TINTEGER
	 | TFLOAT
	 | TSTRING
	 | TID
	 | NULL
	 ;

Statement : LBRACE StatementList RBRACE
		  | IfStatement
		  | WHILE LPAREN Expression RPAREN Statement
		  | Expression ASSIGN Expression SEMICOLON
		  ;

IfStatement : IF LPAREN Expression RPAREN Statement
			| IF LPAREN Expression RPAREN Statement ELSE Statement
			;

Expression : Expression OR Expression
		   | Expression AND Expression
		   | Expression EQUAL Expression
		   | Expression GTHAN Expression
		   | Expression LTHAN Expression
		   | Expression PLUS Expression
		   | Expression MINUS Expression
		   | Expression STAR Expression
		   | Expression SLASH Expression
		   | Expression PERCENT Expression
		   | MINUS Expression
		   | BANG Expression
		   | LPAREN Expression RPAREN
		   | TID
		   | TINTEGER
		   | TFLOAT
		   | TSTRING
		   | TBOOLEAN
		   | NULL
		   ;
