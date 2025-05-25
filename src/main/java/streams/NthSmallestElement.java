package streams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the nth Smallest element in an array using java streams
 */
public class NthSmallestElement {

    public static void main(String args[]) {
        int[] arr = {1,2,3,5,8,9,4};
        int n =3; // 3rd smallest element

        Arrays.stream(arr)
                .sorted()
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);

        //Display the 3ed highest number

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);


    }
}
