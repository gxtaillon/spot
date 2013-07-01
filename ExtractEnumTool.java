import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ExtractEnumTool {
  public static void main(String[] args) throws Exception {
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    // create a lexer that feeds off of input CharStream
    SPOTLexer lexer = new SPOTLexer(input);
    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    // create a parser that feeds off the tokens buffer
    SPOTParser parser = new SPOTParser(tokens);
    ParseTree tree = parser.spclass(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    ExtractEnumListener extractor = new ExtractEnumListener(parser);
    walker.walk(extractor, tree); // initiate walk of tree with listener
    //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
  }
}
