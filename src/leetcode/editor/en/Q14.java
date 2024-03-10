package leetcode.editor.en;

import java.util.Arrays;

public class Q14 {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;

        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return s1.substring(0, index);
    }

    public static void main(String[] args) {
        Q14 solution = new Q14();

        String[] input = {"flower", "flow", "flight"};

        String answer = solution.longestCommonPrefix(input);

        System.out.println("answer = " + answer);
    }
}
