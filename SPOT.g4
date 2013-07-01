grammar SPOT;

Identifier 
    : [a-zA-Z][0-9a-zA-Z_]* 
    ;

tag 
    : Identifier 
    | 'Float' 
    | 'Bool'
    ;

member 
    : tag ':' Identifier
    | Identifier
    ;

spclassDeclarationList
    : member ';'
    | spclassDeclarationList member ';'
    ;

spclass 
    : 'class' Identifier '{' spclassDeclarationList '}' ';' 
    ;

WS  // Define whitespace rule, toss it out
    : [ \t\r\n]+ -> skip 
    ; 
