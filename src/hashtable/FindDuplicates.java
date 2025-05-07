package hashtable;

import java.util.*;

/**
HT: Find Duplicates ( ** Interview Question)
findDuplicates()

Problem: Given an array of integers nums, find all the duplicates in the array using a hash table (HashMap).

Input:

An array of integers nums.

Return Type:

List<Integer> implemented as an ArrayList

List is an interface and ArrayList is a way of implementing the List interface

For more information about interfaces click on "Hints".
 **/

public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for(int num: nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0)+1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if(entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}

