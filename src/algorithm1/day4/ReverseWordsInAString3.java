package algorithm1.day4;

public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println("reverseWords(s) = " + reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String string : strings) {
            sb.append(reverse(string.toCharArray()) + " ");
        }

        String result = sb.toString();
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static String reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(chars);
    }
}
