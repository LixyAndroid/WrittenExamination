package August.test0822;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/22 18:59
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        List<ArrayList<Integer>> juzhen = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                integers.add(in.nextInt());
            }
            juzhen.add(integers);
        }
        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = 0; j < M; j++) {
                sum += juzhen.get(i).get(j);
            }

            if (sum < 0) {
                juzhen.get(i);
            }
        }

        System.out.println(11);
    }
}
