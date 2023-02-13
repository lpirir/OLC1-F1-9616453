package com.luispirir;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class DemoLexerTest {

    @Test
    public void matchId() throws IOException {
        String testString = "id1";
        Reader stringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(stringReader);

        Token token = lexer.yylex();
        assertEquals(TokenConstants.ID, token.getTokenType());
    }

    @Test
    public void matchNum() throws IOException {
        String testString = "13245";
        Reader stringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(stringReader);

        Token token = lexer.yylex();
        assertEquals(TokenConstants.NUM, token.getTokenType());
    }

    @Test
    public void noMatch() throws IOException {
        String testString = "@";

        Exception exception = assertThrows(IOException.class, () -> {
            Reader stringReader = new StringReader(testString);
            DemoLexer lexer = new DemoLexer(stringReader);

            Token token = lexer.yylex();
        });        
    }
}