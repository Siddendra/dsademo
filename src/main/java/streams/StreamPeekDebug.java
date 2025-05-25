package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Debuging the Stream by using the Peek()
 */
public class StreamPeekDebug {

    public static void main(String args[]) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "mango");

        List<String> resukts = words.stream()
                .peek(word -> System.out.println("Original ::" + word))
                .filter(ele -> ele.startsWith("a"))
                .peek(word -> System.out.println("After Filter ::" + word))
                .map(String :: toUpperCase)
                .peek(word -> System.out.println("Conversion Word ::"+ word))
                .collect(Collectors.toList());

        resukts.stream().forEach(System.out::println);
    }
}
