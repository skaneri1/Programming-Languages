grammar ExprLeftRecursion;

// Lexer specification

fragment LETTER	
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	
	:	'0'..'9';
ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;
ADD	:	'+';
SUB	:	'-';
MUL	:	'*';
DIV	:	'/';
LPAR	:	'(';
RPAR	:	')';
WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

// Parser specification

expr	:     	expr ADD term 
        | 	expr SUB term 
        | 	term
	; 
term	:     	term MUL factor 
        | 	term DIV factor 
        | 	factor
        ;
factor	:    	LPAR expr RPAR
        | 	ID
        | 	NUM
	;
