grammar ProjLang;

//Lexer specification

fragment LETTER
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT
	:	'0'..'9';
IF      : 	'if';
WHILE	:	'while';
DO	:	'do';
THEN	:	'then';
EL	:	'else';
LET	:	'let';
VAL	:	'val';
IN	:	'in';
END	:	'end';
FUN	:	'fun';
TRUE	:	'true';
FALSE	:	'false';
ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;
LPAR	:	'(';
RPAR	:	')';
SEMI	:	';';
LB	:	'{';
RB	:	'}';
COL	:	':';
EQ	:	'=';
NEG	:	'!';
ADD	:	'+' | '-' | '|';
MULT	:	'*' | '/' | '&';
RE	:	'<' | '=';


// Parser specification
input	:	expr
	;
	
expr	:	IF expr THEN expr EL expr
	|	LET VAL ID EQ expr IN expr END
	|	LET FUN ID LPAR ID RPAR EQ expr IN expr END
	|	WHILE expr DO expr
	|	LB expr (SEMI expr)* RB
	|	NEG expr
	|	ID COL EQ expr
	|	relexpr
	;

relexpr	:	arithexpr (RE arithexpr)?
	;

arithexpr
	:	term (ADD term)*
	;

term	:	factor (MULT factor)*
	;

factor	:	NUM
	|	TRUE
	|	FALSE
	|	ID
	|	ID LPAR expr RPAR
	|	LPAR expr RPAR
	;

