package test0323;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/23 19:48
 */
public class Test2 {
    public static void main(String[] args) {
        run2();
    }

    private static void run2() {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int res = 0;


        String[][] miGong = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                miGong[i][j] = in.next();
            }
        }

        res = 4;

        System.out.println(res);


    }
}
