grammar qone;

//Lexer specification

fragment LETTER
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT
	:	'0'..'9';
ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;
QUO	:	'\'';
LPAR	:	'(';
RPAR	:	')';
WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

// Parser specification
input	:	p EOF
	;
p	:	e
	;
e	:	ID
	|	NUM
	|	QUO e
	|	LPAR e es RPAR
	;
es	:	e es
	|	
	;

