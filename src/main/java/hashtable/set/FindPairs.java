package main.java.hashtable.set;

import java.util.*;

/**
 * Set: Find Pairs ( ** Interview Question)
 * Given two integer arrays arr1 and arr2, and an integer target, write a method named findPairs that finds all pairs of
 * integers such that one integer is from arr1, the other is from arr2, and their sum equals the target value.
 */
public class FindPairs {
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();
        for (int ele : arr1) {
            mySet.add(ele);
        }
        for(int num : arr2) {
            int complement = target - num;
            if(mySet.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
        }
        return pairs;
    }
    public static void main(String args[]) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2, 5, 6, 6};
        int target =7;
        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair: pairs) {
        System.out.println(Arrays.toString(pair));
        }

    }
}
