package hashtable;

import java.util.*;

/**
 * You have been given an array of strings, where each string may contain only lowercase English letters. You need to write a method groupAnagrams(String[] strings) that groups the anagrams in the array together using a hash table (HashMap). The method should return a list of lists, where each inner array contains a group of anagrams.
 *
 * For example, if the input array is ["eat", "tea", "tan", "ate", "nat", "bat"], the method should return [["eat","tea","ate"],["tan","nat"],["bat"]] because the first three strings are anagrams of each other, the next two strings are anagrams of each other, and the last string has no anagrams in the input array.
 *
 * You need to implement the groupAnagrams(String[] strings) method and return a list of lists, where each inner list contains a group of anagrams according to the above requirements.
 *
 * Return type: List<List<String>>
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anargramGroup = new HashMap<>();
        for(String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);

            if(anargramGroup.containsKey(canonical)) {
                anargramGroup.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anargramGroup.put(canonical, group);
            }
        }
        return new ArrayList<>(anargramGroup.values());
    }


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}
