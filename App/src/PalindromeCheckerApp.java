/**
 * MAIN CLASS – UseCase1PalindromeApp
 * Use Case 1: Application Entry & Welcome Message
 * @author Developer
 * @version 1.0
 */
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Inject strategy into context
        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.executeStrategy(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ===============================================================
 * INTERFACE - PalindromeStrategy
 * ===============================================================
 *
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ===============================================================
 * CLASS - StackStrategy
 * ===============================================================
 *
 * Concrete implementation using Stack.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * ===============================================================
 * CONTEXT CLASS
 * ===============================================================
 *
 * Uses the selected strategy.
 */
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}