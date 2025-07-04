package main.java.leetcode.medium;

/**
 * LeetCode: #322
 * You are given an integer array coins representing coins of different denominations and an integer amount representing
 * a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by
 * any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 */
public class CoinChange {
    private static int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;

        //create the DP array
        int[] minCoinsDP = new int[amount +1];

        for(int i=1; i <= amount; i++) {
            minCoinsDP[i] = Integer.MAX_VALUE;

            //Try each coin
            for(int coin : coins) {
                if(coin <= i && minCoinsDP[i-coin] != Integer.MAX_VALUE) {
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1+minCoinsDP[i-coin]);
                }
            }
        }

        return minCoinsDP[amount] == Integer.MAX_VALUE ? -1: minCoinsDP[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println("Minimum coins Required is:"+ coinChange(coins, amount));

    }
}
