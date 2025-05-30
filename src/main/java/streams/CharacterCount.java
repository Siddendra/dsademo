package main.java.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * Count the Characters on the given string
 * Character: r and count is: 1
 * Character: d and count is: 1
 * Character: e and count is: 1
 * Character: w and count is: 1
 * Character: h and count is: 1
 * Character: l and count is: 3
 * Character: o and count is: 2
 */
public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello world";

        Map<String, Long> charToCount = Arrays.stream(input.split(""))
                .filter(ele -> !ele.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charToCount.forEach((character, count) -> System.out.println("Character: "+ character + " and count is: "+count));
    }
}
