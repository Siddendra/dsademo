package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOffFirstTwoNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int sumOfFistTwo = list.stream()
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("The sum of first two integers is: "+ sumOfFistTwo);

        //Multiple first Two numbers

        Optional<Integer> results = list.stream()
                .limit(2)
                .reduce((a,b) -> a*b);

        results.ifPresent(System.out::println);
    }
}
