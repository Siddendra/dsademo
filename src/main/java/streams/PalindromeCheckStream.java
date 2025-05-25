package streams;

import java.io.InputStream;
import java.util.stream.IntStream;

public class PalindromeCheckStream {
    public static void main(String args[]) {
        String input = "madam";

        boolean ispalindrome = IntStream.range(0, input.length()/2)
                .allMatch(i -> input.charAt(i) == input.charAt(input.length()-1-i));
        System.out.println("Given String is Palindrome :"+ ispalindrome);
    }
}
