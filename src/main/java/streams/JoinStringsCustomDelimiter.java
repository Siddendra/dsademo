package main.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, join the strings with '[' as prefix, ']' as suffix and ',' as delimiter
 */
public class JoinStringsCustomDelimiter {


    public static void main(String[] args) {
        List<String> words  = Arrays.asList("Apple", "Banana", "Mango");
        String results = words.stream()
                .map(el -> "[ " + el + "]")
                .collect(Collectors.joining(","));

        String results1 = words.stream()
                .collect(Collectors.joining(",","[","]"));

        System.out.println(results);

    }
}
