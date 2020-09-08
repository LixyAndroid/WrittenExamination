package test0904;

import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.substring(1, s.length() - 1);
        String[] strings = s.split(", ");
        int[] ints = new int[strings.length + 1];
        for (int i = 0; i < ints.length - 1; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        int res = dfs(ints, 0, 0, 0);
        System.out.println(res);

    }

    private static int dfs(int[] prices, int i, int status, int k) {
        if (i == prices.length - 1 || k == 2) {
            return 0;
        }

        int a = 0, b = 0, c = 0;
        a = dfs(prices, i + 1, status, k);
        if (status == 1) {
            b = dfs(prices, i + 1, 0, k + 1) + prices[i];
        } else {
            c = dfs(prices, i + 1, 1, k) - prices[i];
        }

        return Math.max(Math.max(a, b), c);
    }


}
