package com.ys.easy;

import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<String, Integer> roman = new HashMap<String, Integer>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);

        final int count = s.length();
        int res = 0;

        for (int i =0; i < count;) {
            int end = i+2>count? i+1:i+2;
            String two = s.substring(i, end);
            if (roman.containsKey(two)) {
                res += roman.get(two);
                i += 2;
            } else {
                res += roman.get(String.valueOf(s.charAt(i)));
                i += 1;
            }
        }
        return res;
    }

    public int romanToInt2(String s) {
        int num = 0;
        int l = s.length();
        int last = 1000;
        for (int i = 0; i < l ; i++) {
            int v = getValue(s.charAt(i));
            if (v > last) num = num - last * 2;
            num = num + v;
            last = v;

        }
        return num;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
