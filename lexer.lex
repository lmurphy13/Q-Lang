/*
 * lexer.lex
 *
 * Lexical Analyzer for the Q Programming Language
 * Adapted from: https://gnuu.org/2009/09/18/writing-your-own-toy-compiler/
 * Author: Liam M. Murphy
 */

%{
#include <string>
#include "node.h"
#include "parser.cpp"
#define SAVE_TOKEN yylval.string = new std::string(yytext, yyleng)
#define TOKEN(t) (yylval.token = t)

extern "C" int yywrap() { }
%}

%%

[ \t\n]						;
[a-zA-Z_][a-zA-Z0-9_]*		SAVE_TOKEN; return TID;
[0-9]+.[0-9]*				SAVE_TOKEN; return TFLOAT;
[0-9]+						SAVE_TOKEN; return TINTEGER;
[true|false]				SAVE_TOKEN; return TBOOLEAN;
\"[^"\n]*["\n] 				SAVE_TOKEN; return TSTRING;

":="						return TOKEN(ASSIGN);
"=="						return TOKEN(EQUAL);
"+"							return TOKEN(PLUS);
"-"							return TOKEN(MINUS);
"*"							return TOKEN(STAR);
"/"							return TOKEN(SLASH);
"%"							return TOKEN(PERCENT);
"("							return TOKEN(LPAREN);
")"							return TOKEN(RPAREN):
"{"							return TOKEN(LBRACE);
"}"							return TOKEN(RBRACE);
"["							return TOKEN(LBRACKET);
"]"							return TOKEN(RBRACKET);
"."							return TOKEN(DOT);
","							return TOKEN(COMMA);
";"							return TOKEN(SEMICOLON);
"\'"						return TOKEN(APOSTROPHE);
"\""						return TOKEN(QUOTE);
"<"							return TOKEN(LTHAN);
">"							return TOKEN(GTHAN);
"<="						return TOKEN(LEQUALS);
">="						return TOKEN(GEQUALS);
"!"							return TOKEN(BANG);
"!="						return TOKEN(NEQUALS);
"&&"						return TOKEN(AND);
"||"						return TOKEN(OR)
"func"						return TOKEN(FUNC);	
"if"						return TOKEN(IF);
"else"						return TOKEN(ELSE);
"while"						return TOKEN(WHILE);
"return" 					return TOKEN(RETURN);
"void"						return TOKEN(VOID);
"null"						return TOKEN(NULL);
"EOF"						return TOKEN(EOF);
.							printf("Unknown token!\n"); yyterminate();



/*

"+"		{ printf("PLUS\n"); 		return PLUS;  	}
"-"		{ printf("MINUS\n"); 		return MINUS; 	}
"*"		{ printf("MULT\n");			return STAR;  	}
"/"		{ printf("SLASH\n");		return SLASH; 	}
"%"		{ printf("MOD\n");			return MOD;	  	}
"("		{ printf("LPAREN\n");		return LPAREN;	}
")"		{ printf("RPAREN\n");		return RPAREN;	}
"["		{ printf("LBRACKET\n");		return LBRACKET;}
"]"		{ printf("RBRACKET\n");		return RBRACKET;}
"{"		{ printf("LBRACE\n");		return LBRACE;	}
"}"		{ printf("RBRACE\n");		return RBRACE;	}	
";"		{ printf("SEMICOLON\n");	return SEMICOLON;}
"."		{ printf("DOT\n");			return DOT;		}
","		{ printf("COMMA\n");		return COMMA;	}
":="	{ printf("ASSIGN\n");		return ASSIGN;	}
"=="	{ printf("EQUALS\n");		return EQUALS;	}
"<"		{ printf("LTHAN\n");		return LTHAN;	}
">"		{ printf("GTHAN\n");		return GTHAN;	}
"<="	{ printf("LEQUALS\n");		return LEQUALS;	}
">="	{ printf("GEQUALS\n");		return GEQUALS;	}
"!"		{ printf("BANG\n");			return BANG;	}
"!="	{ printf("NEQUALS\n");		return NEQUALSA;}
"func"	{ printf("FUNC\n");			return FUNC;	}
"if"	{ printf("IF\n");			return IF;		}
"else"	{ printf("ELSE\n");			return ELSE;	}
"while"	{ printf("WHILE\n");		return WHILE;	}
"return" { printf("RETURN\n");		return RETURN;	}
"bool"	{ printf("BOOL\n");			return BOOLEAN;	}
"int"	{ printf("INT\n");			return INTEGER;	}
"float"	{ printf("FLOAT\n");		return FLOAT;   }
"string" { printf("STRING\n");		return STRING;	}
"void"	{ printf("VOID\n");			return VOID;	}
"true"  { printf("TRUE\n");			return TRUE;	}
"false"	{ printf("FALSE\n");		return FALSE;	}
"NULL"	{ printf("NULL\n"); 		return NULL;	}

digit		[0-9
char		[a-zA-Z]

*/

%%


/*
 
{char}({char}|{digit})* 
		yylval.id = strdup(yytex
		printf("string(%s)\n", yytext);
		return STRING;
		
}

{digit}+	{ yylval.num = atoi(yytext);
		printf("INUMBER(%s)\n", yytext);
		}

{digit}+"."{digit}+ { yylval.num = atof(yytext);
		printf("FNUMBER(%s)\n", yytext);
		}
*/

/*
// [ \t\r]  // skip whitespace 
// .		{ printf("Unknown character [%c]", yytext[0]);}

%%
