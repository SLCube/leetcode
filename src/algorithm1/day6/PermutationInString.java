package algorithm1.day6;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println("checkInclusion(s1, s2) = " + checkInclusion(s1, s2));

    }

    public static boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = s1.length();

        char[] s1ToChar = s1.toCharArray();
        Arrays.sort(s1ToChar);
        s1 = new String(s1ToChar);

        while (right <= s2.length()) {
            String substring = s2.substring(left, right);
            char[] substringToChar = substring.toCharArray();
            Arrays.sort(substringToChar);
            substring = new String(substringToChar);

            if (substring.contains(s1)) {
                return true;
            }

            left++;
            right++;
        }
        return false;
    }
}
