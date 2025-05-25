package streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given the list of integers, find the first odd number of the list using stream function.
 */
public class FirstOddNumber {
    public static void main(String[]  args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 4, 9, 6);

        numbers.stream()
                .mapToInt(ele -> ele)
                .filter(ele -> ele%2 != 0)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
