package day4;

public class ReverseString {
    public static void main(String[] args) {
        char[] hello = "hello".toCharArray();
        reverseString(hello);

        for (char c : hello) {
            System.out.println("c = " + c);
        }
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
