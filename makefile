antlr='/usr/local/lib/antlr-4.0-complete.jar'

build: SPOT.g4 *.java
	mkdir build classes
	java -jar $(antlr) -o ./build SPOT.g4
	cp -fu *.java ./build
	javac -d ./classes ./build/*.java

clean:
	rm -rf ./build ./classes

