package main.java.hashtable.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set: Has Unique Chars ( ** Interview Question)
 * Write a Java program to determine if a given string contains all unique characters or not.
 *
 * Implement a method called hasUniqueChars that takes a single argument, a string, and returns a boolean value.
 *
 * The method should return true if all characters in the input string are unique and false if there are any duplicate characters.
 */
public class HasUniqueCharacters {
    public static boolean hasUniqueCharacters(String string) {
        Set<Character> charSet = new HashSet<>();
        for (char c: string.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            } else {
                charSet.add(c);
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(hasUniqueCharacters("hello"));
        System.out.println(hasUniqueCharacters("0123456"));
    }
}
