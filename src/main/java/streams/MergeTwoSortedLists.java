package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 Merge the two Sorted lists into a single sorted list using java streams
 */
public class MergeTwoSortedLists {

    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(1,3,5,7);
        List<Integer> list2 = Arrays.asList(2,4,6,8);

        List<Integer> mergedSortedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());
        mergedSortedList.forEach(System.out::println);

    }
}
