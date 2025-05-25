package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatisticsExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,8,9,0);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(n -> n)
                .summaryStatistics();
        System.out.println("Minimum: "+ stats.getMin());
        System.out.println("Minimum: "+ stats.getMax());

    }

}
