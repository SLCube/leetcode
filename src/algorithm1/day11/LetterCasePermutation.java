package algorithm1.day11;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        letterCasePermutation.letterCasePermutation("a1b2");
    }

    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backTracking(result, s, new char[s.length()], 0);
        return result;
    }

    private void backTracking(List<String> result, String s, char[] chars, int index) {
        if (index == s.length()) {
            result.add(new String(chars));
            return;
        }

        char c = s.charAt(index);

        if (Character.isDigit(c)) {
            chars[index] = c;
            backTracking(result, s, chars, index + 1);
        } else {
            chars[index] = Character.toLowerCase(c);
            backTracking(result, s, chars, index + 1);
            chars[index] = Character.toUpperCase(c);
            backTracking(result, s, chars, index + 1);
        }
    }
}
