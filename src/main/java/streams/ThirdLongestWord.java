package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdLongestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "Orange", "Mnago", "Banana");
        words.stream()
                //.sorted((word1, word2) -> Integer.compare(word1.length(), word2.length()))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
