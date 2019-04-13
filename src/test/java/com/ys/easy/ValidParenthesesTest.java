package com.ys.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        String s1 = "()";
        assertTrue(validParentheses.isValid(s1));

        String s2 = "()[]{}";
        assertTrue(validParentheses.isValid(s2));

        String s3 = "(]";
        assertFalse(validParentheses.isValid(s3));

        String s4 = "([)]";
        assertFalse(validParentheses.isValid(s4));

        String s5 = "{[]}";
        assertTrue(validParentheses.isValid(s5));
    }

    @Test
    public void isValid2() {
        ValidParentheses validParentheses = new ValidParentheses();
        String s1 = "()(){}[]";
        assertTrue(validParentheses.isValid2(s1));

        String s2 = "({[()]})[]{}";
        assertTrue(validParentheses.isValid2(s2));

        String s3 = "(]";
        assertFalse(validParentheses.isValid2(s3));

        String s4 = "([)]";
        assertFalse(validParentheses.isValid2(s4));

        String s5 = "{[]]}";
        assertFalse(validParentheses.isValid2(s5));
    }
}