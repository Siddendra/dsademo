package main.java.leetcode.easy;

public class BestTimeToBuyAndSellAStock {

    public static int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int profit =0;
        for(int i=1; i< prices.length; i++) {
            if(prices[i] < buyPrice ) {
                buyPrice = prices[i];
            } else {
                int current_profit = prices[i] - buyPrice;
                profit = Math.max(current_profit, profit);
            }

        }

        return profit;
    }

    public static void main(String args[]) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }}
