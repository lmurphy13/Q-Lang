JAVAC = javac
ANTLR = /usr/local/lib/antlr-4.11.1-complete.jar

SOURCES = src/parser/*.java
PARSESRC = src/parser/Q.g4
CLASSES = $(SOURCES:.java=.class)

all: $(PARSESRC)
	java -jar $(ANTLR) $(PARSESRC)
	$(JAVAC) $(SOURCES)

clean:
	rm src/parser/*.java
	rm src/parser/*.class
