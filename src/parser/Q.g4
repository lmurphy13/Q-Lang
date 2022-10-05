grammar Q;

program
: mainFunctionDecl ( functionDecl )*
;

mainFunctionDecl
: FUNC INT MAIN LPAREN RPAREN LBRACE ( variableDecl )* ( statement )* RBRACE
;

variableDecl
: type ID ( ASSIGN expression )? SEMICOLON
;

functionDecl
: FUNC type ID LPAREN ( type ID ( COMMA type ID )* )? RPAREN LBRACE ( variableDecl )* ( statement )* RETURN expression SEMICOLON RBRACE
;

voidDecl
: FUNC VOID ID LPAREN RPAREN LBRACE ( variableDecl )* ( statement )* RBRACE
;

type:
| BOOL
| INT
| FLOAT
| STRING
| ID
;

statement
: LBRACE ( statement )* RBRACE
| IF LPAREN expression RPAREN statement ( ELSE statement )?
| WHILE LPAREN expression RPAREN statement
| ID LPAREN ( expression ( COMMA expression )* )? RPAREN SEMICOLON
| expression ASSIGN expression SEMICOLON
;

expression
: expression OR expression
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
| expression MOD expression
| MINUS expression
| BANG expression
| LPAREN expression RPAREN
| ID LPAREN ( expression ( COMMA expression )* )? RPAREN
| ID
| Integer
| Float
| StringLiteral
| TRUE
| FALSE
| NUL
;

FUNC: 'func';
INT: 'int';
MAIN: 'main';
FLOAT: 'float';
BOOL: 'bool';
STRING: 'string';
VOID: 'void';
ASSIGN: ':=';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';

GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
NE: '!=';
AND: '&&';
OR: '||';
EQ: '==';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
MOD: '%';
BANG: '!';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
COMMA: ',';
DOT: '.';
SEMICOLON: ';';
D_QUOTE: '"';

TRUE: 'true';
FALSE: 'false';
NUL: 'null';

ID
: ( Char )+ ( Char | Digit )*
;

fragment Char: [a-zA-Z] ;

fragment Digit: [0-9] ;

Integer: ( Digit )+ ;

Float: ( Digit )+ DOT ( Digit )+ ;

StringLiteral: D_QUOTE .*? D_QUOTE ;

Whitespace
: [ \t]+ -> skip
;

Newline
: ( '\r' '\n'? | '\n' ) -> skip
;

