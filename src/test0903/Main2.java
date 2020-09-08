package test0903;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] juzhen = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                juzhen[i][j] = in.nextInt();

            }
        }

        int[][] juzhen2 = new int[row + 2][col + 2];
        for (int i = 1; i < juzhen2.length - 1; i++) {
            if (juzhen2[0].length - 1 - 1 >= 0)
                System.arraycopy(juzhen[i - 1], 0, juzhen2[i], 1, juzhen2[0].length - 1 - 1);
        }


        for (int i = 1; i < juzhen2.length - 1; i++) {
            for (int j = 1; j < juzhen2[0].length - 1; j++) {

                int cnt = 5;
                if (juzhen2[i - 1][j] == 0) {
                    cnt -= 1;
                }
                if (juzhen2[i + 1][j] == 0) {
                    cnt -= 1;
                }
                if (juzhen2[i][j - 1] == 0) {
                    cnt -= 1;
                }
                if (juzhen2[i][j + 1] == 0) {
                    cnt -= 1;
                }

                juzhen2[i][j] = Math.round(((float) (juzhen2[i - 1][j] + juzhen2[i + 1][j] + juzhen2[i][j - 1] + juzhen2[i][j + 1] + juzhen2[i][j]) / cnt));


            }
        }


        for (int i = 1; i < juzhen2.length - 1; i++) {
            for (int j = 1; j < juzhen2[0].length - 1; j++) {
                if (j == juzhen2[0].length - 2) {
                    System.out.println(juzhen2[i][j]);
                } else {
                    System.out.print(juzhen2[i][j] + " ");

                }
            }
        }

    }


}
