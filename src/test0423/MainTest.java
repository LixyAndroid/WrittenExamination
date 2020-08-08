package test0423;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/23 18:26
 */
public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.valueOf(in.nextLine());
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String[] l1 = s1.split(" ");
        String[] l2 = s2.split(" ");


        long[] k1 = {0, Integer.valueOf(l1[0]), Integer.valueOf(l1[1]), Integer.valueOf(l1[2])};
        long[] k2 = {0, Integer.valueOf(l2[0]), Integer.valueOf(l2[1]), Integer.valueOf(l2[2])};


        for (int i = 3; i < n; i++) {
            long num1 = Integer.valueOf(l1[i]);
            long num2 = Integer.valueOf(l2[i]);
            k1[0] = num1;
            Arrays.sort(k1);
            k2[0] = num2;
            Arrays.sort(k2);

        }
        long sum1 = k1[1] + k1[2] + k1[3];
        long sum2 = k2[1] + k2[2] + k2[3];
        System.out.println(Math.max(sum1, sum2));
    }
}
