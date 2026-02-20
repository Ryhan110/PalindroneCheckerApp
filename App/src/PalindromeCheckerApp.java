/**
 * MAIN CLASS – UseCase1PalindromeApp
 * Use Case 1: Application Entry & Welcome Message
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - Version 4.0");
        System.out.println("----------------------------------");

        String input = "radar";
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}