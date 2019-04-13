package com.ys.easy;

import java.util.Stack;
import java.util.ArrayList;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        ArrayList<String> trueValue = new ArrayList<String>();
        trueValue.add("()");
        trueValue.add("{}");
        trueValue.add("[]");

        for (char c: s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                StringBuilder combind = new StringBuilder();
                combind.append(stack.peek());
                combind.append(c);
                if (trueValue.contains(combind.toString())) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
