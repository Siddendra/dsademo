package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfUniqueNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,6,7,8,9,9,8);

        int sumOfUniqueNumbers = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("SumOfUniqueNumbers is: " + sumOfUniqueNumbers );
    }
}
