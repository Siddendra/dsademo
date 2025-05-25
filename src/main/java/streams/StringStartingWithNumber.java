package streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, find out the strings which are starting with a number
 */
public class StringStartingWithNumber {

    public static void main(String args[]) {
        List<String> list = Arrays.asList("1apple", "banana", "3cherry", "date", "5mango");

        list.stream().filter(ele -> !ele.isEmpty() && Character.isDigit(ele.charAt(0)))
                .forEach(System.out::println);
    }
}
