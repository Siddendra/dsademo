package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringFinder {
    public static void main(String args[]) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "mango");
        Optional<String> longest = words.stream().max(Comparator.comparingInt(String::length));
        //Optional<String> longest = words.stream().max(Comparator.comparingInt(word -> word.length()));

        longest.ifPresent(System.out::println);
    }
}
