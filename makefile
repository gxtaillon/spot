antlr='/usr/local/lib/antlr-4.1-complete.jar'
grun='org.antlr.v4.runtime.misc.TestRig'
defaultTest='../Demo1.spo'
spo=$(defaultTest)

build: SPOT.g4 *.java
	mkdir -p build classes
	java -jar $(antlr) -o ./build SPOT.g4
	cp -fu *.java ./build
	javac -d ./classes ./build/*.java

clean:
	rm -rf ./build ./classes

all: | clean build
 
test-extract:
	cd classes; \
	cat $(spo) | java ExtractPawnTool

test-gui:
	cd classes; \
	cat $(spo) | java $(grun) SPOT compilationUnit -gui
