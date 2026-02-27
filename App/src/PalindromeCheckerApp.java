/**
 * MAIN CLASS – UseCase1PalindromeApp
 * Use Case 1: Application Entry & Welcome Message
 * @author Developer
 * @version 1.0
 */
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create large test string
        String input = generateLargePalindrome(100000);

        // Strategy 1: Two Pointer
        PalindromeStrategy twoPointer = new TwoPointerStrategy();

        long start1 = System.nanoTime();
        boolean result1 = twoPointer.check(input);
        long end1 = System.nanoTime();

        long duration1 = end1 - start1;

        // Strategy 2: Stack Based
        PalindromeStrategy stackStrategy = new StackStrategy();

        long start2 = System.nanoTime();
        boolean result2 = stackStrategy.check(input);
        long end2 = System.nanoTime();

        long duration2 = end2 - start2;

        System.out.println("Input length: " + input.length());
        System.out.println("-----------------------------------");
        System.out.println("TwoPointer Result: " + result1);
        System.out.println("TwoPointer Time: " + duration1 + " ns");
        System.out.println("-----------------------------------");
        System.out.println("Stack Result: " + result2);
        System.out.println("Stack Time: " + duration2 + " ns");
    }

    // Utility method to generate large palindrome
    private static String generateLargePalindrome(int size) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size / 2; i++) {
            sb.append("a");
        }

        String firstHalf = sb.toString();
        return firstHalf + new StringBuilder(firstHalf).reverse();
    }
}

/**
 * ===============================================================
 * INTERFACE - PalindromeStrategy
 * ===============================================================
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * ===============================================================
 * Two Pointer Strategy (O(1) space)
 * ===============================================================
 */
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

/**
 * ===============================================================
 * Stack Strategy (O(n) space)
 * ===============================================================
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
}