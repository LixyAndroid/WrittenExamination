package test0323;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/23 18:32
 */
public class Test1 {
    public static void main(String[] args) {
        run1();
    }

    private static void run1() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;

        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            ints[i] = i+1;
        }


        for (int i = 1; i < n-1; i++) {
            ints[i] = n*(n-1)/(i+1);
        }




        for (int i = 1; i <n-1; i++) {

            res+=ints[i]*(i+1);

        }


        res += 2*n;

        if (n==1){
            System.out.println(1);
        }else {
            System.out.println(res);

        }


    }
}
