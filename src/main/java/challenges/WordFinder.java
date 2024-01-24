package challenges;

import java.util.Scanner;

public class WordFinder {
    public static String findWord(String sentence, int n) {
        // Split the sentence into words using whitespace as the delimiter
        String[] words = sentence.split("\\s+");

        // Check if the input value of n is valid
        if (n >= 1 && n <= words.length) {
            // Return the nth word
            return words[n - 1];
        } else {
            // If n is not valid, return an empty string
            return "";
        }
    }

    public static void main(String[] args) {
        // Example input sentence
        String inputSentence = "I can program in Java";

        // Prompt the user for the value of n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Call the findWord method and store the result
        String result = findWord(inputSentence, n);

        // Print the result
        if (!result.isEmpty()) {
            System.out.println("The " + ordinalSuffix(n) + " word is: " + result);
        } else {
            System.out.println("Invalid value of n.");
        }
    }

    // Helper method to get the ordinal suffix for a number (e.g., 1st, 2nd, 3rd)
    public static String ordinalSuffix(int number) {
        if (number >= 11 && number <= 13) {
            return number + "th";
        }

        switch (number % 10) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }
    }
}
