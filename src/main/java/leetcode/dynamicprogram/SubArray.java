package main.java.leetcode.dynamicprogram;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    private static final int MIN_GOOD_SUBARRAY_LIMIT = 2;

    public boolean hasGoodSubarray(int[] nums, int k) {
        if (nums == null) {
            return false;
        }

        long sumSoFar = 0;
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);  // Manually put the initial key-value pair

        // Map<Integer, Integer> remainderIndexMap = new HashMap<>(Map.of(0, -1));
        // Only works with Java 9 or higher

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            sumSoFar += (long) nums[currentIndex];
            Integer firstIndex = remainderIndexMap.get((int) (sumSoFar % k));

            if (firstIndex == null) {
                remainderIndexMap.put((int) (sumSoFar % k), currentIndex);
            } else if (currentIndex - firstIndex >= MIN_GOOD_SUBARRAY_LIMIT) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases can be added here for manual testing
        SubArray solution = new SubArray();
        int[] nums = {23, 2, 4, 7};
        int k = 6;
        boolean result = solution.hasGoodSubarray(nums, k);
        System.out.println("Result: " + result);
    }
}
