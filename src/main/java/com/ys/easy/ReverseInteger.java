package com.ys.easy;


public class ReverseInteger {

    public int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE) {
            return (int) r;
        } else {
            return 0;
        }
    }

    public int reverse2(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int result = 0;
        int maxdiff = Integer.MAX_VALUE / 10;
        while (x != 0) {
            if (result > maxdiff || x == Integer.MIN_VALUE) return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return isNegative ? -result : result;
    }

    public int reverse3(int x) {
        boolean isNegative = x < 0;
        String s = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
        char[] chars = s.toCharArray();

        int result = 0;
        int maxdiff = Integer.MAX_VALUE / 10;
        for (char c : chars) {
            if (result > maxdiff || x == Integer.MIN_VALUE) return 0;
            result = result * 10 + Character.getNumericValue(c);
        }
        return isNegative ? -result : result;

    }

    public static void main(String[] args) {
        ReverseInteger test = new ReverseInteger();
//        int x = -2147483648;
        int x = -123;
        System.out.println(test.reverse(x));
        System.out.println(test.reverse2(x));
        System.out.println(test.reverse3(x));

    }
}
