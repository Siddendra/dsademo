package leetcode.medium;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];

        for(int i=1; i<= text1.length(); i++) {
            for (int j=1; j<= text2.length(); j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1+ dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        String text1= "abcde";
        String text2 = "ace";

        System.out.println("Logest Common Subsequence :"+ longestCommonSubsequence(text1, text2));
    }

}
