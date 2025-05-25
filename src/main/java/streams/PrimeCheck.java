package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Check if a list of integers cntains a prime number using java streams
 */
public class PrimeCheck {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        boolean containsPrime  = numbers.stream().anyMatch(ele -> isPrime(ele));

        System.out.println("List Contains Prime number is:"+containsPrime);

        //To print the Prime Numbers

        numbers.stream().filter(ele -> isPrime(ele)).collect(Collectors.toList()).forEach(System.out::println);




    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        /*for(int i =2; i<= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;

        */
        return IntStream.rangeClosed(2,(int)Math.sqrt(num))
                .noneMatch(el -> num%el == 0);

    }
}
