%{
	#include <stdio.h>
	#include <string.h>
	#include <stdlib.h>
	#include <ctype.h>
	#include "lex.yy.c"

	void yyerror(const char *s);
	int yylex();
	int yywrap();
%}

%token FUNC BOOL INT FLOAT STRING VOID IF ELSE RETURN TRUE FALSE WHILE LBRACE RBRACE LPAREN RPAREN LBRACK RBRACK BANG DOT COMMA COLON SEMICOLON STAR SLASH PLUS MINUS MODULO AND OR EQ GT GE LT LE NE ASSIGN STR CHAR NUMBER FLOAT_NUM ID

%%

program: main_function_decl function_decl_list
;

main_function_decl: FUNC INT "main" '(' ')' '{' variable_decl_list statement_list '}'
;

function_decl_list: function_decl function_decl_list
| void_decl function_decl_list
| function_decl
| void_decl
| %empty
;

function_decl: FUNC type ID '(' arg_list ')' '{' variable_decl_list statement_list RETURN expression ';' '}'
| FUNC type ID '(' ')' '{' variable_decl_list statement_list RETURN expression ';' '}'
;

arg_list: arg arg_list
| ',' arg arg_list
| arg
| %empty
;

arg: type ID
;

void_decl: FUNC VOID ID '(' ')' '{' variable_decl_list statement_list '}'
;

type: BOOL
| INT
| FLOAT
| STRING
| ID
| array_type
;

array_type: type '[' ']'
;

variable_decl_list:	variable_decl variable_decl_list
| variable_decl 
| %empty
;

variable_decl:	type ID ASSIGN expression ';'
| type ID ';'
;

statement_list: statement statement_list
| statement 
| %empty
;

statement: '{' statement_list '}'
| IF '(' expression ')' statement else_list
| WHILE '(' expression ')' statement
| expression ASSIGN expression ';'
;

else_list: ELSE '(' expression ')' statement else_list
| %empty
;

expression: expression OR expression
| expression AND expression
| expression EQ expression
| expression GT expression
| expression LT expression
| expression GE expression
| expression LE expression
| expression NE expression
| expression PLUS expression
| expression MINUS expression
| expression STAR expression
| expression SLASH expression
| expression MODULO expression
| expression '[' expression ']'
| MINUS expression
| BANG expression
| '(' expression ')'
| ID
| INT
| FLOAT
| BOOL
| STRING
| TRUE
| FALSE
| "NULL"
;

