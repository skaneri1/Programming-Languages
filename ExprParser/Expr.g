grammar Expr;

// Lexer specification

fragment DIGIT	
	:	'0'..'9';
NUM	:	DIGIT+;
ADD	:	'+';
SUB	:	'-';
MUL	:	'*';
DIV	:	'/';
LPAR	:	'(';
RPAR	:	')';
WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

// Parser specification
input	:	expr EOF //EOF is a predefined token
	;
expr returns [Expr e]
	:     	t1 = term {$e = $t1.e;} (ADD t2 = term {$e = new Plus($e, $t2.e);} 
	| 	(SUB t2 = term {$e = new Subtract($e, $t2.e);})*
	; 
term returns [Expr e]
	:     	t3 = term {$e = $t1.e;} (MUL t4 = term {$e = new Mult($e, $t2.e);} 
	| 	(DIV t4 = term {$e = new Divide($e, $t2.e);})*
        ;
factor returns [Expr e]
	:    	LPAR expr RPAR ($e = $term.e;)
        | 	NUM {$e = new Num(Integer.parseInt($NUM.text))}
	;





