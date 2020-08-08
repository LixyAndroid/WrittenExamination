package test0426;

import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int[] x = new int[T];

        for (int i = 0; i < T; i++) {

            x[i] = in.nextInt();
        }

        in.close();

        for (int i = 0; i < x.length; i++) {

            int Q = x[i];

            int index = 1;
            boolean isFind = false;

            while (true) {

                if (Q == trailing(index)) {
                    isFind = true;
                    System.out.println(index);
                    break;
                }else if (Q<trailing(index)){
                    isFind = false;
                    break;
                }
                index++;

            }

            if (!isFind){
                System.out.println("No solution");
            }
        }


    }

    public static int trailing(int n) {

        int count = 0;
        while (n > 5) {
            count += n / 5;
            n /= 5;
        }
        return count;


    }




}
