package dsa.recursion.array.assignment3;

import java.util.Arrays;

// Write recursive function that takes an array of words and returns an array containing all words capitalized
// i/p : ["foo", "bar", "world"]
// o/p : ["FOO", "BAR", "WORLD"]

public class CapitalWord {

    public static String[] capitalizeAllWords(String[] words) {
        if (words == null || words.length == 0) {
            return new String[0]; // Base case: empty array
        }

        String[] capitalizedWords = new String[words.length];
        capitalizeWordsRecursive(words, capitalizedWords, 0);

        return capitalizedWords;
    }

    private static void capitalizeWordsRecursive(String[] words, String[] capitalizedWords, int index) {
        if (index == words.length) {
            return; // Base case: reached the end of the array
        }

        String currentWord = words[index];
        String capitalizedWord = currentWord.toUpperCase();
        capitalizedWords[index] = capitalizedWord;

        capitalizeWordsRecursive(words, capitalizedWords, index + 1); // Process the next word recursively
    }
    
    public static void main(String[] args) {
        String[] words = {"foo", "bar", "world"};
        String[] capitalizedWords = capitalizeAllWords(words);
        System.out.println(Arrays.toString(capitalizedWords));
    }

}
