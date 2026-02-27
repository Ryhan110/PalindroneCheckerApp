/**
 * MAIN CLASS – UseCase1PalindromeApp
 * Use Case 1: Application Entry & Welcome Message
 * @author Developer
 * @version 1.0
 */
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string to validate
        String input = "madam";

        // Create a Deque to store characters
        Deque<Character> deque = new LinkedList<>();

        // Insert each character into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}