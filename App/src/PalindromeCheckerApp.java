/**
 * MAIN CLASS – UseCase1PalindromeApp
 * Use Case 1: Application Entry & Welcome Message
 * @author Developer
 * @version 1.0
 */
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "racecar";

        // Call recursive check
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Original input
        String input = "A man a plan a canal Panama";

        // Normalize:
        // 1. Remove non-alphanumeric characters
        // 2. Convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Original Input : " + input);
        System.out.println("Normalized Input : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}