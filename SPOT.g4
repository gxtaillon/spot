grammar SPOT;

/* Misc */
Identifier 
    : [a-zA-Z][0-9a-zA-Z_]* 
    ;

WhiteSpace  // Define whitespace rule, toss it out
    : [ \t\r\n]+ 
    -> skip 
    ; 

LineTerminator
    : [\r\n]+
    ;

InputCharacter
    : [^\r\n]
    ;

/* SourcePawn */
start
    : (PpAll
    | spClassDeclaration)*
    ;



/* - Preprocessor directives */
PpAll
    : '#' .*? LineTerminator
    ;

/* - Pawn */
tag 
    : Identifier 
    | 'Float' 
    | 'Bool'
    ;

accessQualifier
    : 'public'
    | 'protected'
    | 'private'
    ;    

variableDeclaration
    : accessQualifier? (tag ':')? Identifier ('[' InputCharacter+ ']')?
    ;

variableDeclarationList
    : variableDeclaration ','
    | variableDeclarationList variableDeclaration ','
    ;

fonctionDeclarationHead
    : accessQualifier? (tag ':')? Identifier '(' variableDeclarationList? ')'
    ;

fonctionDeclarationBody
    : '{' .*? '}'
    ;

fonctionDeclaration
    : fonctionDeclarationHead (fonctionDeclarationBody | ';')
    ;

/* - Object Translator */
spClassVariableDeclarationList
    : variableDeclaration ';'
    | spClassVariableDeclarationList variableDeclaration ';'
    ;

spClassFonctionDeclarationList
    : fonctionDeclaration
    | spClassFonctionDeclarationList fonctionDeclaration
    ;

spClassDeclaration
    : 'class' Identifier '{' spClassVariableDeclarationList spClassFonctionDeclarationList '}' ';' 
    ;

