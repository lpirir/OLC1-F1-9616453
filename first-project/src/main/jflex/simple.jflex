package com.luispirir;

import java.io.*;

%%
%public
%class DemoLexer

digit = [0-9]
letter = [a-zA-Z]
whitespace = [ \t\r]
set = CONJUNTO
%type Token

%eofval{

    return new Token(TokenConstants.EOF, null);

%eofval}
%%

{letter}({letter}|{digit})* { return new Token(TokenConstants.ID, yytext()); }
{digit}+ { return new Token(TokenConstants.NUM, yytext()); }
[^] { throw new IOException("La cadena es ilegal > " + yytext()); }