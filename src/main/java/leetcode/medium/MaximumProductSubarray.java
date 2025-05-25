package leetcode.medium;

public class MaximumProductSubarray {

    static int maxProduct(int[] nums) {
        int n = nums.length;
        long leftProfit = 1;
        long rightProfit = 1;
        long ans = nums[0];
        for (int i=0; i<n; i++) {
           leftProfit = ( leftProfit == 0 || leftProfit < Integer.MIN_VALUE) ? 1 : leftProfit;
           rightProfit = ( rightProfit == 0 || rightProfit < Integer.MIN_VALUE) ? 1: rightProfit;

           leftProfit *=nums[i];
           rightProfit *=nums[n-1-i];

           ans = Math.max(ans, Math.max(leftProfit, rightProfit));
        }

        return (int)ans;

    }

    public static void main(String args[]) {

        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));

    }
}
