package com.ys.easy;

import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates1() {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();

        int[] nums = stringToIntegerArray("[1,1,2]");
        int ret = r.removeDuplicates(nums);
        String out = integerArrayToString(nums, ret);
        assertEquals("[1, 2]", out);

    }

    @Test
    public void removeDuplicates2() {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();

        int[] nums = stringToIntegerArray("[0,0,1,1,1,2,2,3,3,4]");
        int ret = r.removeDuplicates(nums);
        String out = integerArrayToString(nums, ret);
        assertEquals("[0, 1, 2, 3, 4]", out);

    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

}