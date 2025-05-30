package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {

        int height = triangle.size();
        int[][] dp = new int[height+1][height+1];

        for(int level = height-1; level>= 0; level-- ) {
            for(int i=0; i <= level; i++) {
                dp[level][i] = triangle.get(level).get(i) + Math.min(dp[level+1][i], dp[level+1][i+1]);
            }
        }

        return dp[0][0];

    }

    public static void main(String args[]) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println("Minimum Total is: "+ minimumTotal(triangle));

    }
}
