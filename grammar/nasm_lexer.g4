lexer grammar nasm_lexer;

fragment A:[aA];
fragment B:[bB];
fragment C:[cC];
fragment D:[dD];
fragment E:[eE];
fragment F:[fF];
fragment G:[gG];
fragment H:[hH];
fragment I:[iI];
fragment J:[jJ];
fragment K:[kK];
fragment L:[lL];
fragment M:[mM];
fragment N:[nN];
fragment O:[oO];
fragment P:[pP];
fragment Q:[qQ];
fragment R:[rR];
fragment S:[sS];
fragment T:[tT];
fragment U:[uU];
fragment V:[vV];
fragment W:[wW];
fragment X:[xX];
fragment Y:[yY];
fragment Z:[zZ];



ADD : A D D ;

EBP : 'ebp' ;
ESP : 'esp' ;

MOV : M O V ;

PUSH : P U S H ;




ASTERISK : '*' ;
AT : '@' ;

BYTE : B Y T E ;
BACKSLASH: '\\' ;

CALL : C A L L ;
CLOSEING_BRACKET : ')' ;
COLON : ':' ;
COMMA : ',' ;
CSEG : 'cseg' ;

DB : 'db' ;
DEF : 'def' ;
DEVICE : 'device' ;
DOT : '.' ;
DSEG : 'dseg' ;

ELSE : 'else' ;
END_MACRO : 'endmacro' ;
ENDIF : 'endif' ;
EQUALS : '=' ;
EQU : E Q U ;
ERROR : 'error' ;
EXTERN : 'extern' ;

GLOBAL : 'global' ;
GT : '>' ;

HASH_TAG : '#' ;

IF : 'if' ;
INCLUDE : 'include' ;

LEAVE : L E A V E ;
LEFT_SHIFT : '<<' ;
LT : '<' ;

MACRO : 'macro' ;
MINUS : '-' ;

OPENING_BRACKET : '(' ;
ORG : 'org' ;

PLUS : '+' ;

RET : R E T ;
RIGHT_SHIFT : '>>' ;

SECTION : 'section' ;
SLASH : '/' ;

NEWLINE : '\r'? '\n' ;
//NEWLINE : '\r'? '\n' -> skip ;
//NEWLINE : '\r'? '\n' -> channel(HIDDEN) ;

//WS : [ \t\n\r\f]+ -> channel(HIDDEN) ;
//WS : [ \t\n\r\f]+ -> skip ;
WS : [ \t\f]+ -> skip  ;

//LINE_COMMENT : ';' ~[\r\n]* -> channel(HIDDEN) ;
LINE_COMMENT 
    : 
    //( ';' | HASH_TAG ) ~[\r\n]* -> skip // hashtag is reserved for the preprocessor
    ( ';' ) ~[\r\n]* -> skip 
    ;

//BLOCK_COMMENT 
//    : 
    // non-greedy
//    '/*' .*? '*/' -> skip 
    // greedy
    //'/*' .* '*/' -> skip 
//    ;

BLOCK_COMMENT : '/*' (BLOCK_COMMENT|.)*? '*/' -> channel(HIDDEN) ;
DOUBLE_SLASH_LINE_COMMENT : '//' .*? '\n' -> channel(HIDDEN) ;

STRING : '"' ( '""' | ~'"' )* '"' ; // quote-quote is an escaped quote
SINGLE_QUOTE_STRING : '\'' ( ~'\'' )* '\'' ;
CHAR : '\'' (.) '\'' ;
ESCAPED_CHAR : '\'' '\\' (.) '\'' ;

NUMBER : ( PLUS | MINUS )?[0-9]+ ;
HEX_NUMBER : ('0' 'x' | '$') [a-fA-F0-9]+ ;
BINARY_NUMBER : '0' 'b' [0,1]+ ;

IDENTIFIER : [a-zA-Z_.]([a-zA-Z0-9_])* ;