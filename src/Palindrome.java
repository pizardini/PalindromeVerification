import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Palindrome {
    public static String reverseString(String str) {
        int length = str.length();
        StringBuilder result = new StringBuilder(length);

        for (int i = length - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean isPalindrome(String word) {
        String reversed = reverseString(word);
        return reversed.equals(word);
    }

    public static boolean anagramPalindrome(String word) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }


    public static boolean isPalindrome2(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
