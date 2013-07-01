import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SPOT {
  public static void main(String[] args) throws Exception {
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    // create a lexer that feeds off of input CharStream
    SPOTLexer lexer = new SPOTLexer(input);
    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    // create a parser that feeds off the tokens buffer
    SPOTParser parser = new SPOTParser(tokens);
    ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
    System.out.println(tree.toStringTree(parser)); // print LISP-style tree
  }
}