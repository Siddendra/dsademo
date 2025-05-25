package streams;

import java.util.Arrays;

/**
 * Find the Word with K vowels in a given sentence.
 */
public class WordsWithVowels {

    public static void main(String args[]) {
        String sentence = "I have a orange and Apple on the Table";
        int k = 3;

        Arrays.stream(sentence.split(" "))
                .filter(word -> countVowels(word) == k)
                .forEach(System.out::println);

    }

    public static long countVowels(String word) {
        return word.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch)!= -1)
                .count();
    }
}
