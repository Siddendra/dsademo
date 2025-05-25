package streams;

import java.util.Arrays;

/**
 * Find the last element in the stream.
 */
public class LastElementStreams {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(arr)
                .skip(arr.length-1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
