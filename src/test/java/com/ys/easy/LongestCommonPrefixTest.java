package com.ys.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};
        String[] s3 = {",", "b"};

        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(s1));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(s2));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(s3));

    }
}