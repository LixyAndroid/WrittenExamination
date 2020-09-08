package test0904;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.substring(2, s.length() - 2);
        System.out.println(s);
        String[] strings = s.split("],");
        System.out.println(Arrays.toString(strings));

        System.out.println((strings[0].length() + 1) / 2);

        int col = (strings[0].length() + 1) / 2;
        int row = strings.length;

        int[][] ints = new int[row][col];

        for (int i = 0; i < row; i++) {
            int index = 0;
            if (i != 0) {
                index = 1;
            }
            for (int j = 0; j < col; j++) {
                ints[i][j] = strings[i].charAt(index) - '0';
                index += 2;
            }
        }

        System.out.println(Arrays.toString(ints[0]));

        System.out.println(Arrays.toString(ints[row - 1]));

        int res = minCost(ints,row,col);
        System.out.println(res);

    }

    public static int minCost(int[][] cost, int m, int n) {

        int[][] dp = new int[m][n];

        dp[0][0] = cost[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }

        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j-1]) + cost[i][j];
            }
        }

        return dp[m-1][n-1];
    }
}
