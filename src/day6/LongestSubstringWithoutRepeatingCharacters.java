package day6;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("lengthOfLongestSubstring(s) = " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int result = 1;

        if (s.length() == 1) {
            return result;
        }

        int left = 0;
        int right = 1;
        while (left < s.length() && right < s.length()) {
            String subString = s.substring(left, right);
            String ch = s.substring(right, right + 1);
            if (!subString.contains(ch)) {
                right++;
                result = Math.max(result, right - left);
            } else {
                left++;
            }
        }

        return result;
    }
}
