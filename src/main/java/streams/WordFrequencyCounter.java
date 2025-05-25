package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * WordFrequencyCounter
 */
public class WordFrequencyCounter {
    public static void main(String args[]) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "mango", "apple");

        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        //Another way
        Map<String, Long> wordCount1 = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        wordCount1.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
