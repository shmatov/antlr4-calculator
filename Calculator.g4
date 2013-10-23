grammar Calculator;
INT    : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
PI     : 'pi';
E      : 'e';
POW    : '^';
NL     : '\n';
WS     : [ \t\r]+ -> skip;
ID     : [a-zA-Z_][a-zA-Z_0-9]*;

PLUS  : '+';
EQUAL : '=';
MINUS : '-';
MULT  : '*';
DIV   : '/';
LPAR  : '(';
RPAR  : ')';

input
    : setVar NL input     # ToSetVar
    | plusOrMinus NL? EOF # ShowResult
    ;

setVar
    : ID EQUAL plusOrMinus # SetVariable
    ;


plusOrMinus 
    : multOrDiv PLUS plusOrMinus  # Plus
    | multOrDiv MINUS plusOrMinus # Minus
    | multOrDiv                   # ToMultOrDiv
    ;

multOrDiv
    : pow MULT multOrDiv # Multiplication
    | pow DIV multOrDiv  # Division
    | pow                # ToPow
    ;

pow
    : unaryMinus (POW pow)? # Power
    ;

unaryMinus
    : MINUS unaryMinus # ChangeSign
    | atom             # ToAtom
    ;

atom
    : PI                    # ConstantPI
    | E                     # ConstantE
    | DOUBLE                # Double
    | INT                   # Int
    | ID                    # Variable
    | LPAR plusOrMinus RPAR # Braces
    ;
