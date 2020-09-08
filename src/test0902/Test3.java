package test0902;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();

        int[] chicun = new int[N];
        int[] jiazhi = new int[N];
        for (int i = 0; i < N; i++) {
            chicun[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            jiazhi[i] = in.nextInt();
        }


        List<double[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            double[] temp = new double[2];
            temp[0] = i;
            temp[1] = (double) jiazhi[i] * 1.0 / chicun[i] * 1.0;
            list.add(temp);
        }

        boolean swapped;
        for (int i = 0; i < list.size(); i++) {
            swapped = false;
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j)[1] < list.get(j - 1)[1]) {
                    double[] temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                    swapped = true;
                }

            }

            if (!swapped) {
                break;
            }
        }

        int V = 0;
        int money = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (V + chicun[(int) list.get(i)[0]] <= K) {
                V += chicun[(int) list.get(i)[0]];
                money += jiazhi[(int) list.get(i)[0]];
            }
        }

        System.out.println(money);
    }
}
