package challenges;

public class WordReversal {
    public static String reverseWords(String sentence) {
        //Split the sentense into words using whitespace as the delimiter
        String[] words = sentence.split("\\s+");


        //Splitting the Sentence:
        //
        //We use the split("\\s+") method to split the input sentence into an array of words
        // based on whitespace. The regular expression \\s+ matches one or more whitespace characters.

        //Reverse the array of words
        //Reversing the Words:
        //
        //We iterate through the array of words in reverse order and append each word to a StringBuilder with a space in between.
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            //Append each reversed word to the result with a spase in between
            reversedSentence.append(words[i]).append(" ");
        }

        // Capitalize the first letter of the reversed sentence
        //Capitalization:
        //
        //We capitalize the first letter of the reversed sentence using Character.toUpperCase()
        reversedSentence.setCharAt(0, Character.toUpperCase(reversedSentence.charAt(0)));

        // Add punctuation (assuming the sentence ends with a period)
        //Punctuation:
        //
        //Assuming the sentence ends with a period, we append the last character of the original sentence to the reversed sentence.
        reversedSentence.append(sentence.charAt(sentence.length() - 1));

        // Convert the StringBuilder to a String and trim any extra whitespace

        //Trimming and Returning:
        //
        //We convert the StringBuilder to a String, trim any extra whitespace, and return the result.
        return reversedSentence.toString().trim();
    }



    //Example in the main Method:
    //
    //The main method demonstrates how to use the reverseWords function with an example sentence and prints the reversed sentence.
    public static void main(String[] args) {
        // Example input sentence
        String inputSentence = "Codecademy is the best!";

        // Call the reverseWords method and store the result
        String outputSentence = reverseWords(inputSentence);

        // Print the reversed sentence
        System.out.println(outputSentence);
    }
}


