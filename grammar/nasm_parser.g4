// http://lab.antlr.org/

parser grammar nasm_parser;
options { tokenVocab=nasm_lexer; }

compilation_unit :
    ( NEWLINE | line )+
    EOF
    ;

line :
    ( label COLON )? instruction
    |
    label COLON
    |
    assembler_instruction
    |
    data_definition
    ;

label :
    IDENTIFIER
    ;

instruction :
    mnemonic ( param ( COMMA param )? )?
    ;

mnemonic :
    mnemonic_a | mnemonic_c | mnemonic_l| mnemonic_m | mnemonic_p | mnemonic_r
    ;

mnemonic_a :
    ADD
    ;

mnemonic_c :
    CALL
    ;

mnemonic_l :
    LEAVE
    ;

mnemonic_m :
    MOV
    ;

mnemonic_p :
    PUSH
    ;

mnemonic_r :
    RET
    ;

param :
    register_32
    |
    IDENTIFIER
    |
    BINARY_NUMBER
    |
    HEX_NUMBER
    | 
    NUMBER 
    ;

register_32	: 
    EBP | ESP
	;

assembler_instruction :
    EXTERN IDENTIFIER
    |
    GLOBAL IDENTIFIER
    |
    SECTION IDENTIFIER
    ;

data_definition :
    IDENTIFIER DB data_definition_list
    ;

// left-recursive
//data_definition_list
//    :
//    data_definition_list_entry
//    |
//    data_definition_list COMMA data_definition_list_entry
//    ;

// right-recursive
data_definition_list :
    data_definition_list_entry
    |
    data_definition_list_entry COMMA data_definition_list
    ;

data_definition_list_entry :
    SINGLE_QUOTE_STRING | NUMBER
    ;