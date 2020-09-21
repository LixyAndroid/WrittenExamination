package September.test0912;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/9/12 16:21
 */
public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        int sum = 0;
        Arrays.sort(ints);
        int[] dp = new int[ints.length];
        dp[ints.length - 1] = ints[ints.length - 1];
        for (int i = ints.length - 2; i >= 0; i--) {
            dp[i] = dp[i + 1] + ints[i];
        }

        boolean isfind = false;
        for (int i = dp.length - 1; i >= 0; i--) {
            if (dp[i] % 7 == 0) {
                System.out.println(dp[i]);
                isfind = true;
                break;
            }

        }

        if (!isfind) {
            System.out.println(-1);
        }
    }
}
