package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/***
 * How do you sort the Given list of decimals in reverse order ?
 */

public class SortDecimalsReverse {

    public static void main(String args[]) {
        List<Double> decimals = Arrays.asList(3.14, 1.39, 2.65, 4.89, 0.77);
        decimals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
