package spot.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import spot.parser.SPOTLexer;
import spot.parser.SPOTParser;

public class ExtractPawnTool {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: <Source>");
        }

        ANTLRInputStream input = new ANTLRInputStream(getFileContent(args[0])
                .toString());

        // create a lexer that feeds off of input CharStream
        SPOTLexer lexer = new SPOTLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        SPOTParser parser = new SPOTParser(tokens);

        // begin parsing at init rule
        ParseTree tree = parser.compilationUnit();

        // create standard walker
        ParseTreeWalker walker = new ParseTreeWalker();

        StatefulPawnExtractor extractor = new StatefulPawnExtractor(parser,
                new ExtractorConfig());

        // initiate walk of tree with listener
        walker.walk(extractor, tree);
        System.out.println(extractor.getTranslation());
    }

    private static StringBuffer getFileContent(String path) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;

        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(path));

            while ((sCurrentLine = br.readLine()) != null) {
                sb.append(sCurrentLine);
                sb.append("\n");
            }

        } catch (IOException e) {
            throw e;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                throw ex;
            }
        }

        return sb;
    }
}
