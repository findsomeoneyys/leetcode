package com.ys.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {

    @Test
    public void TestromanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void TestromanToInt2() {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(3, romanToInteger.romanToInt2("III"));
        assertEquals(4, romanToInteger.romanToInt2("IV"));
        assertEquals(9, romanToInteger.romanToInt2("IX"));
        assertEquals(58, romanToInteger.romanToInt2("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt2("MCMXCIV"));
    }
}