%{
	#include "y.tab.h"
	int countn = 0;		// line number
%}

%option yylineno

alpha [a-zA-Z]
digit [0-9]

%%

"func"			{ return FUNC;   }
"bool"			{ return BOOL;   }
"int"			{ return INT;    }
"float"			{ return FLOAT;  }
"string"		{ return STRING; }
"void"			{ return VOID;   }
"if"			{ return IF;     }
"else"			{ return ELSE;   }
"return"		{ return RETURN; }
"true"			{ return TRUE;   }
"false"			{ return FALSE;  }
"while"			{ return WHILE;  }
"{"				{ return LBRACE; }
"}"				{ return RBRACE; }
"("				{ return LPAREN; }
")"				{ return RPAREN; }
"["				{ return LBRACK; }
"]"				{ return RBRACK; }
"!"				{ return BANG;   }
"."				{ return DOT;    }
","				{ return COMMA;  }
":"				{ return COLON;  }
";"				{ return SEMICOLON; }
"*"				{ return STAR;   }
"/"				{ return SLASH;  }
"+"				{ return PLUS;   }
"-"				{ return MINUS;  }
"%"				{ return MODULO; }
"&&"			{ return AND;    }
"||"			{ return OR;     }
"=="			{ return EQ;     }
">"				{ return GT;     }
">="			{ return GE;     }
"<"				{ return LT;     }
"<="			{ return LE;     }
"!="			{ return NE;     }
":="			{ return ASSIGN; }

[-]?{digit}+	{ return NUMBER; }
[-]?{digit}+\.{digit}{1,6} { return FLOAT_NUM; }
{alpha}({alpha}|{digit})* { return ID; }

\/\/.*			{ ; }
\/\*(.*\n)*.*\*\/ { ; }
[ \t]*			{ ; }
[\n]			{ countn++; }
.				{ return *yytext; }
["].*["]		{ return STR;  }
['].[']			{ return CHAR;    }

%%

int yywrap() {
	return 1;
}
