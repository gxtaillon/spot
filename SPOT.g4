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


/* - Preprocessor directives */
PpAll
    : '#' .*? LineTerminator 
    -> skip
    ;

/* - Pawn */
tag 
    : Identifier 
    | 'Float' 
    | 'Bool'
    ;

variableBase
    : (tag ':')? Identifier ('[' InputCharacter+ ']')?
    ;

/* - Object Translator */
spClassVariableList
    : variableBase ';'
    | spClassVariableList variableBase ';'
    ;

spClass 
    : 'class' Identifier '{' spClassVariableList '}' ';' 
    ;

