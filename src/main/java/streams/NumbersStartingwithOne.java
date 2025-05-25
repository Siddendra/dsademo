package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingwithOne {

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(10, 21, 13, 41, 15, 2, 1, 100, 23);
       List<Integer> numbersStartingWithOne= numbers.stream()
                .filter(ele -> String.valueOf(ele).startsWith("1"))

               .collect(Collectors.toList());

        List<Integer> numbersStartingWithNonOnes= numbers.stream()
                .filter(ele -> !String.valueOf(ele).startsWith("1"))
                .collect(Collectors.toList());
       //numbersStartingWithNonOnes.forEach(System.out::println);
       numbersStartingWithOne.forEach(System.out::println);
    }

}
