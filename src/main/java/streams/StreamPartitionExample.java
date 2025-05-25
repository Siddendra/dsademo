package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionExample {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1,2,3,4,56,7,8,9);

        Map<Boolean, List<Integer>> partitionMap =
                nums.stream().collect(Collectors.partitioningBy(e -> e%2 == 0));

        System.out.println("Even numbers: "+ partitionMap.get(true));
        System.out.println("Odd numbers: "+ partitionMap.get(false));
    }
}
