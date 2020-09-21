package September.test0905;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] strings = s.split(",");

        int[] daoju = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            daoju[i] = Integer.parseInt(strings[i]);
        }
        int res = numberofprize(daoju[0], daoju[1], daoju[2]);

        System.out.println(res);

//        Arrays.sort(daoju);
//        int res = 0;
//        res += daoju[0];
//        daoju[1] -= daoju[0];
//        daoju[2] -= daoju[0];
//        daoju[0] = 0;
//        while (daoju[1] > 0) {
//            daoju[1] -= 2;
//            daoju[2] -= 2;
//            res++;
//        }
//
//        while (daoju[2] > 0) {
//            daoju[2] -= 5;
//            res++;
//        }
//
//        System.out.println(res);


    }

    public static int numberofprize(int a, int b, int c) {
        // write code here
        int[] daoju = new int[3];
        daoju[0] = a;
        daoju[1] = b;
        daoju[2] = c;

        Arrays.sort(daoju);
        int res = 0;
        res += daoju[0];
        daoju[1] -= daoju[0];
        daoju[2] -= daoju[0];
        daoju[0] = 0;
        while (daoju[1] > 1) {
            daoju[1] -= 2;
            daoju[2] -= 2;
            res++;
        }

        while (daoju[2] > 4 || (daoju[1] == 1 && daoju[2] > 2)) {
            if (daoju[1] == 1) {
                daoju[2] -= 3;
                daoju[1] -= 1;
            } else {
                daoju[2] -= 5;
            }

            res++;
        }

        return res;

    }
}
