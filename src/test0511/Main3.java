package test0511;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        fun();
    }

    private static void fun() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //天数
        int m = in.nextInt();

        int[] c_i = new int[n];
        for (int i = 0; i < n; i++) {
            c_i[i] = in.nextInt();
        }

        int[] a_i = new int[m];
        int[] b_i = new int[m];
        for (int i = 0; i < m; i++) {
            a_i[i]=in.nextInt();
            b_i[i]=in.nextInt();
        }

        int cnt = 0;
        int i =0;
        while (i<m){
            if (c_i[a_i[i]-1]!=c_i[b_i[i]-1]){
                c_i[a_i[i]-1]=c_i[b_i[i]-1];
                cnt++;
            }
            i++;
        }




        System.out.println(cnt);

        in.close();

    }
}
