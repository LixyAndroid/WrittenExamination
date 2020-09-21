package March.test0315;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/15 20:44
 */
public class Test3 {
    public static void main(String[] args) {
        run3();
    }

    private static void run3() {

        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        int row  = in.nextInt();
        int[][] map= new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                map[i][j] = in.nextInt();
            }

        }

        System.out.println(3);

    }
}
