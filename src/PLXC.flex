import java_cup.runtime.*;

%%
%cup

%%
int|char|float                                        { return new Symbol(sym.TYPE, yytext()); }
if                                                    { return new Symbol(sym.IF); }
else                                                  { return new Symbol(sym.ELSE); }
while                                                 { return new Symbol(sym.WHILE); }
do                                                    { return new Symbol(sym.DO); }
for                                                   { return new Symbol(sym.FOR); }
print                                                 { return new Symbol(sym.PRINT); }
\[                                                    { return new Symbol(sym.LSQR); }
\]                                                    { return new Symbol(sym.RSQR); }
\{                                                    { return new Symbol(sym.LCURL); }
\}                                                    { return new Symbol(sym.RCURL); }
\(                                                    { return new Symbol(sym.LPAR); }
\)                                                    { return new Symbol(sym.RPAR); }
\,                                                    { return new Symbol(sym.COMA); }
\;                                                    { return new Symbol(sym.SEMI); }
\=\=                                                  { return new Symbol(sym.EQ);}
\!\=                                                  { return new Symbol(sym.NOTEQ);}
\<                                                    { return new Symbol(sym.LT);}
\<\=                                                  { return new Symbol(sym.LTEQ);}
\>                                                    { return new Symbol(sym.GT);}
\>\=                                                  { return new Symbol(sym.GTEQ);}
\!                                                    { return new Symbol(sym.NOT);}
\>\=                                                  { return new Symbol(sym.GTEQ);}
\&\&                                                  { return new Symbol(sym.AND);}
\|\|                                                  { return new Symbol(sym.OR);}
\=                                                    { return new Symbol(sym.ASIGN); }
\+                                                    { return new Symbol(sym.PLUS); }
\-                                                    { return new Symbol(sym.MINUS); }
\*                                                    { return new Symbol(sym.TIMES); }
\/                                                    { return new Symbol(sym.DIVIDE); }
print                                                 { return new Symbol(sym.PRINT); }

[a-zA-Z][a-zA-Z0-9]*                                  { return new Symbol(sym.IDENT, yytext().toString()); }
\'[^'\n]*\'                                              { String charVal = yytext().toString().substring(1, yytext().toString().length() - 1); return new Symbol(sym.CHAR, charVal); }
[0-9]+                                                { int value = Integer.valueOf(yytext()); return new Symbol(sym.INT, value); }
\d+(\.\d+)?(E[\+\-]?\d+)?                             { float value = Float.valueOf(yytext()); return new Symbol(sym.FLOAT, value);}

\/\/.*											      {  }
\r|\n                                                 {  }
\ |\t|\f                                              {  }
[^]                                                   { throw new Error("Illegal character <"+yytext()+">"); }


