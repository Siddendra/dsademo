package leetcode.medium;

public class EditDistance {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n= word2.length();

        int[][] costDp = new int[m+1][n+1];

        for (int i=1; i<= m; ++i) costDp[i][0] = i;
        for (int j=1; j<=n; ++j) costDp[0][j] =j;

        for (int i=1; i<=m; i++) {

            for (int j=1; j<=n; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    costDp[i][j] = costDp[i-1][j-1];
                } else {
                    int topleft = costDp[i-1][j-1];
                    int top = costDp[i][j-1];
                    int left = costDp[i-1][j];

                    costDp[i][j] = Math.min(topleft, Math.min(top, left)) +1;
                }
            }
        }
        return costDp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        String word1= "horse";
        String word2 = "ros";
        System.out.println(minDistance(word1, word2));
    }
}
