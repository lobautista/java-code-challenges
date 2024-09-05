package com.apexsystems.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
       GenerateParentheses generateParentheses = new GenerateParentheses();

       assertEquals("[((())), (()()), (())(), ()(()), ()()()]", generateParentheses.generateParenthesis(3).toString());
       assertEquals("[()]", generateParentheses.generateParenthesis(1).toString());
    }
}
