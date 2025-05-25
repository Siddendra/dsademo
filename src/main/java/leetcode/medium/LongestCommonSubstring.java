package leetcode.medium;

public class LongestCommonSubstring {
    static int longestCommonString(String m, String n) {
        char[] str1 = m.toCharArray();
        char[] str2 = n.toCharArray();

        int[][] dp = new int[str1.length+1][str1.length+1];
        int max =0;

        for (int i=1; i<= str1.length; i++) {
            for(int j=1; j<=str2.length; j++) {
                if(str1[i-1] == str2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] +1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max;
    }

    public static void main(String args[]) {
        String str1 ="zfbcdzb";
        String str2 = "zbcdf";

        System.out.println("Logest Substring Length is: "+ longestCommonString(str1, str2));

    }

}
