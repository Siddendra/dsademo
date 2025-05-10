import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
//find uncommon elements from 2 arrays below
//int[] array1 = {1,5,3,7};
//int[] array2 = {2,7,5,4};
//Output - {1,2,3,4}
 */
public class UncommonElementsWithStreams {


    public static void main(String[] args) {

        int[] array1 = {1,5,3,7};
        int[] array2 = {2,7,5,4};

        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());

        //Find the elements in Set1 not in set2
        Set<Integer> uniqueForm1 = set1.stream().filter(ele -> !set2.contains(ele)).collect(Collectors.toSet());

        Set<Integer> uniqueForm2 = set2.stream().filter(ele -> !set1.contains(ele)).collect(Collectors.toSet());

        Set<Integer> results = Stream.concat(uniqueForm1.stream(), uniqueForm2.stream()).collect(Collectors.toSet());

        System.out.println("Uncommon Elements "+ results);


    }


}
