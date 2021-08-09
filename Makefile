lex.yy.c: lexer.lex
	flex lexer.lex

parser.c: parser.y
	bison parser.y

clean:
	rm lex.yy.c
