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
input	:	expr EOF
	;

expr returns [Expr e]
	:	IF expr THEN expr EL expr
	|	LET VAL ID EQ expr IN expr END
	|	LET FUN ID LPAR ID RPAR EQ expr IN expr END
	|	WHILE expr DO expr
	|	LB expr (SEMI expr)* RB
	|	NEG expr
	|	ID COL EQ expr
	|	relexpr
	;

relexpr	returns [Expr e]
	:	arithexpr (RE arithexpr)?
	;

arithexpr returns [Expr e]
	:	t1 = term {$e = $t1.e;} (ADD t2 = term {$e = new Plus($e, $t2.e);}
	;

term returns [Expr e]
	:	t3 = term {$e = $t1.e;} (MUL t4 = term {$e = new Mult($e, $t2.e);}*
	;

factor returns [Expr e]
	:	NUM {$e = new IntVal(Integer.parseInt($NUM.text))}
	|	LPAR expr RPAR ($e = $term.e;)
	|	ID LPAR expr RPAR ($e = $term.e;)
	;
