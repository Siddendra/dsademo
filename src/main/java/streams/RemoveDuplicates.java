package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        //By using distinct
        list.stream().distinct().forEach(System.out::println);

        //By using SET
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);


    }
}
