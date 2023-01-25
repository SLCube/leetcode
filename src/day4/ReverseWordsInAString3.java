package day4;

public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        String result = reverseWords("Let's take LeetCode contest");
        System.out.println("result = " + result);
    }

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            char[] chars = string.toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            sb.append(chars);
            sb.append(" ");
        }
        String result = sb.toString();
        return result.subSequence(0, result.length() - 1).toString();
    }
}
