package spot.lang.state;

import org.antlr.v4.runtime.TokenStream;

import spot.lang.Scope;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.ClassSpecifierContext;
import spot.parser.SPOTParser.CompoundStatementContext;
import spot.parser.SPOTParser.DirectDeclaratorContext;

public class SSGlobal extends ScopeStateBase {
    StringBuilder headerBuilder;

    public SSGlobal(IStatefulExtractor _source) {
        super(_source, new Scope(), null);

        headerBuilder = new StringBuilder();

        String pc = getSourceConfig().getPathCore();
        headerBuilder.append("#include \"" + pc + "memory.sp\"\n");
        headerBuilder.append("#include \"" + pc + "oo.sp\"\n");
        headerBuilder.append("\n");
        headerBuilder.append("#pragma semicolon 1\n");
        headerBuilder.append("\n");
    }

    @Override
    public void exitCompilationUnit(SPOTParser.CompilationUnitContext ctx) {
        headerBuilder.append(currentBuilder);
        // dispose currentBuilder?
        currentBuilder = headerBuilder;
    }

    @Override
    public void enterClassSpecifier(ClassSpecifierContext ctx) {
        getSourceExtractor().setState(
                new SSClassSpecifier(getSourceExtractor(), currentScope, this,
                        ctx));
    }

    @Override
    public void enterDirectDeclarator(DirectDeclaratorContext ctx) {
        if (ctx.Identifier() != null) {
            TokenStream tokens = getSourceExtractor().getParser().getTokenStream();
            String id = tokens.getText(ctx);        
            currentBuilder.append(id);
        }
    }

    @Override
    public void enterCompoundStatement(CompoundStatementContext ctx) {
        currentBuilder.append("{\n");
    }

    @Override
    public void exitCompoundStatement(CompoundStatementContext ctx) {
        currentBuilder.append("}\n");
    }
}
