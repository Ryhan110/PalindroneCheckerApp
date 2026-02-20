/**
 * MAIN CLASS – UseCase1PalindromeApp
 * Use Case 1: Application Entry & Welcome Message
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - Version 3.0");
        System.out.println("----------------------------------");

        String input = "level";
        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}