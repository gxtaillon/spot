package spot.lang.state;

import spot.lang.EVisibility;
import spot.lang.Scope;
import spot.lang.TagClass;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;

public class SSClassSpecifier extends ScopeStateBase {
    protected TagClass currentClass;

    public SSClassSpecifier(IStatefulExtractor _source,
            Scope previousScope,
            ScopeStateBase _previousState,
            String classId) {
        super(_source, _previousState);
        previousScope.copyTo(currentScope);

        String up = getSourceConfig().getUniversalPrefix();
        currentClass = new TagClass(up + TagClass.getPawnEnumId(classId));

        pawnCommentLine("BEGIN CLASS " + currentClass.identifier);
        pawnDefine(currentClass.identifier + up + "Id",
                Integer.toString(currentClass.getUId()));
    }

    @Override
    public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
        String up = getSourceConfig().getUniversalPrefix();

        // Define the size
        pawnDefine(currentClass.identifier + up + "Size",
                Integer.toString(currentClass.variables.size()));
        pawnCommentLine("END CLASS " + currentClass.identifier);
        pawnLine();

        ret();
    }

    /* Substates */
    @Override
    public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
        // Get the visibility
        EVisibility vis = (ctx.classVisibility() != null) ? EVisibility
                .getVisFromToken(ctx.classVisibility().toString()) : null;

        if (ctx.identifierList() != null) {
            // Parsing variables
            getSourceExtractor().setState(
                    new SSClassSpecifier_SSHIdentifierList(
                            getSourceExtractor(), this, currentClass, vis));
        } else if (ctx.functionDefinition() != null) {
            // Parsing a function
            getSourceExtractor().setState(
                    new SSClassSpecifier_SSHFunctionDefinition(
                            getSourceExtractor(), this, currentClass, vis));
        }
    }
}
