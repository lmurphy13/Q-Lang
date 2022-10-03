CC = gcc

EXEC = qc
SOURCES = $(wildcard src/*.c)
LEXSRC = src/lexer.l
PARSESRC = src/parser.y
OBJECTS = $(SOURCES:.c=.o)
CFLAGS = -g -Wall

$(EXEC): $(OBJECTS) $(LEXSRC) $(PARSESRC)
	flex $(LEXSRC)
	bison -v -d $(PARSESRC)
	gcc $(OBJECTS) $(CFLAGS) -o $(EXEC)

%.o: %.c include/%.h
	gcc -c $(CFLAGS) $< -o $@

clean:
	rm lex.yy.c
	rm parser.output
	rm parser.tab.c
	rm parser.tab.h
