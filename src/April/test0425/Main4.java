package April.test0425;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/25 16:35
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();

        int[] company = new int[n];

        for (int i = 0; i < n; i++) {
            company[i]=scanner.nextInt();
        }


        int[] exisze = new int[n];
        for (int i = 0; i < n; i++) {
            exisze[i]=scanner.nextInt();
        }


        int[][] dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            if (i==0){
                dp[i][0] = 0;
                dp[i][1] = company[i];
                dp[i][2] = exisze[i];
                continue;
            }

            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]);

            dp[i][1] = Math.max(dp[i-1][2]+company[i],dp[i-1][0]+company[i]);

            dp[i][2] = Math.max(dp[i-1][1]+exisze[i],dp[i-1][0]+exisze[i]);



        }

        System.out.println(n-Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2])));

        scanner.close();
    }
}
