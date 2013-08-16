package spot.lang.state;

import spot.lang.API;
import spot.lang.EVisibility;
import spot.lang.Function;
import spot.lang.Scope;
import spot.lang.TagClass;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;

public class SSClassSpecifier extends ScopeStateBase {
    public static final String DEFAULT_CTOR_ID = "ctor";
    public static final String DEFAULT_DTOR_ID = "dtor";
    public static final String DEFAULT_THIS_ID = "this";
    protected TagClass currentClass;
    protected StringBuilder headerBuilder;

    public SSClassSpecifier(IStatefulExtractor _source,
            Scope previousScope,
            ScopeStateBase _previousState,
            String classId) {
        super(_source, _previousState);
        headerBuilder = new StringBuilder();
        previousScope.copyTo(currentScope);

        String up = getSourceConfig().getUniversalPrefix();
        currentClass = new TagClass(up + TagClass.getPawnEnumId(classId));

        // Note that the tag exists for children states
        currentScope.tags.put(currentClass.identifier, currentClass);

        pawnCommentLine(headerBuilder, "BEGIN CLASS " + currentClass.identifier);

        currentClass.pSize = currentClass.identifier + up + "Size";
        // Class ID
        currentClass.pId = currentClass.identifier + up + "Id";
        pawnDefine(headerBuilder, currentClass.pId, Integer.toString(currentClass.getUId()));

        currentClass.cleanIdentifier = classId;
    }

    public static void pawnUpperCtor(StringBuilder builder,
            String sizeMacro,
            String idMacro) {
        // Call to NewC
        builder.append(API.NewC);
        builder.append("(");
        builder.append(DEFAULT_THIS_ID);
        builder.append(",");
        builder.append(sizeMacro);
        builder.append(");\n");

        // Put the class Id in the first cell
        builder.append(API.DerefC);
        builder.append("(");
        builder.append(DEFAULT_THIS_ID);
        builder.append(") = ");
        builder.append(idMacro);
        builder.append(";\n");

        pawnCommentLine(builder, "BEGIN USER");
    }

    public static void pawnLowerCtor(StringBuilder builder) {
        pawnCommentLine(builder, "END USER");

        builder.append("return ");
        builder.append(DEFAULT_THIS_ID);
        builder.append(";\n");
    }

    public static void pawnDefaultCtor(StringBuilder builder,
            String ctorId,
            String sizeMacro,
            String idMacro) {
        builder.append(ctorId);
        builder.append("() {\n");

        pawnUpperCtor(builder, sizeMacro, idMacro);
        pawnLowerCtor(builder);

        builder.append("}\n");
    }

    public static void pawnUpperDtor(StringBuilder builder) {
        pawnCommentLine(builder, "BEGIN USER");
    }

    public static void pawnLowerDtor(StringBuilder builder, String sizeMacro) {
        pawnCommentLine(builder, "END USER");

        // Free up the allocated space
        builder.append(API.FreeC);
        builder.append("(");
        builder.append(DEFAULT_THIS_ID);
        builder.append(",");
        builder.append(sizeMacro);
        builder.append(");\n");
    }

    public static void pawnDefaultDtor(StringBuilder builder,
            String dtorId,
            String sizeMacro) {
        builder.append(dtorId);
        builder.append("(");
        builder.append(DEFAULT_THIS_ID);
        builder.append(") {\n");

        pawnUpperDtor(builder);
        pawnLowerDtor(builder, sizeMacro);

        builder.append("}\n");
    }

    @Override
    public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
        String up = getSourceConfig().getUniversalPrefix();

        // Class Size
        pawnDefine(headerBuilder, currentClass.pSize,
                Integer.toString(currentClass.variables.size()));
        pawnLine();

        // Default constructor and destructor
        if (!currentClass.functions.containsKey(currentClass.cleanIdentifier)) {
            // There has not been any contructor defined

            Function ctor = new Function(currentClass.cleanIdentifier,
                    currentClass);
            currentClass.functions.put(currentClass.cleanIdentifier, ctor);

            pawnDefaultCtor(currentBuilder, currentClass.cleanIdentifier,
                    currentClass.pSize, currentClass.pId);
        }

        String dtorId = TagClass.getPawnFuncId(DEFAULT_DTOR_ID,
                currentClass.identifier);
        if (!currentClass.functions.containsKey(dtorId)) {
            // There has not been any destructor defined

            Function dtor = new Function(dtorId, currentClass);
            currentClass.functions.put(dtorId, dtor);

            pawnDefaultDtor(currentBuilder, dtorId, currentClass.pSize);
        }

        // Update the parent scope. (Maybe do this elsewhere?)
        previousState.currentScope.tags.put(currentClass.identifier,
                currentClass);

        // Mark the end of the class
        pawnCommentLine("END CLASS " + currentClass.identifier);
        pawnLine();
        
        headerBuilder.append(currentBuilder);
        currentBuilder = headerBuilder;

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
