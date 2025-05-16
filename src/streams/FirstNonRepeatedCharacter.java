package streams;

// Given a string, find the first non-repeated character in it using stream function.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String args[]) {
        String input = "swiss";

        input.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
