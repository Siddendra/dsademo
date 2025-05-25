package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class DuplicateChecker {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 5};

        Set<Integer> hashSet = new HashSet<>();

        boolean result = Arrays.stream(num)
                .anyMatch(ele -> !hashSet.add(ele));

        //Another way
        boolean hasDiplicates = Arrays.stream(num)
                        .distinct()
                                .count() != num.length;

        System.out.println("Array has the Duplicates :"+result);


    }
}
