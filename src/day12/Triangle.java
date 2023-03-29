package day12;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        List<List<Integer>> input = new ArrayList<>();
        input.add(List.of(-1));
        input.add(List.of(2, 3));
        input.add(List.of(1, -1, -3));

        System.out.println("triangle.minimumTotal(input) = " + triangle.minimumTotal(input));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m-1).size();

        int[][] dp = new int[m][n];
        int min = Integer.MAX_VALUE;
        dp[0][0] = triangle.get(0).get(0);
        if(m==1)return dp[0][0];
        for (int i = 1; i < m; i++) {
            List<Integer> cur = triangle.get(i);
            for (int j = 0; j < cur.size(); j++) {
                if(j==0){
                    dp[i][j] = cur.get(j) + dp[i-1][j];
                }else if(j==cur.size()-1){
                    dp[i][j] = cur.get(j) + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j-1],dp[i-1][j]) + cur.get(j);
                }
                if(i == m-1){
                    min =  Math.min(dp[i][j],min);
                }
            }
        }

        return min;
    }
}
