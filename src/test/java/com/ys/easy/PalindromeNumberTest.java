package com.ys.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    @Test
    public void testisPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void testisPalindrome2() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome2(121121));
        assertFalse(palindromeNumber.isPalindrome2(-123213333));
    }
}