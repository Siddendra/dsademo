package leetcode.medium;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] T = new int[nums.length];

        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(nums[i] > nums[j]) {
                    if(T[j] +1 > T[i]) {
                        T[i] = T[j] +1;
                    }
                }
            }
        }
        int maxindex = 0;
        for(int i=0; i< T.length; i++) {
            if(T[i] > T[maxindex]) {
                maxindex =i;
            }
        }
        return T[maxindex] +1;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println("LongestIncreasingSubsequence is: "+ lengthOfLIS(nums));
    }
}
