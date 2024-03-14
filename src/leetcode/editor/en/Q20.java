package leetcode.editor.en;

import java.util.Stack;

public class Q20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        if (chars.length % 2 == 1) {
            return false;
        }
        for (char c : chars) {
            switch (c) {
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                default -> stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Q20 solution = new Q20();

        String sample = "([}}])";

        boolean result = solution.isValid(sample);
        System.out.println("result = " + result);
    }
}
