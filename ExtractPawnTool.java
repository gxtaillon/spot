import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ExtractPawnTool {
  public static void main(String[] args) throws Exception {
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    // create a lexer that feeds off of input CharStream
    SPOTLexer lexer = new SPOTLexer(input);
    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    // create a parser that feeds off the tokens buffer
    SPOTParser parser = new SPOTParser(tokens);
    ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    ExtractPawnListener extractor = new ExtractPawnListener(parser);
    walker.walk(extractor, tree); // initiate walk of tree with listener
  }
}
