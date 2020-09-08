package test0903;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int res = 0;
        List<int[]> list = new ArrayList<>();
        res =2;
        for (int i = 0; i < n; i++) {

            int[] temp = new int[3];
            for (int j = 0; j < 3; j++) {
                temp[i] = in.nextInt();
            }
            list.add(temp);
        }

        System.out.println(2);

    }
}
