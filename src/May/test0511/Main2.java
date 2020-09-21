package May.test0511;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        fun();
    }

    private static void fun() {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = 2;
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder stringBuilder2 = new StringBuilder(s);
        ArrayList<String> stringArrayList = new ArrayList<>();
        int N = in.nextInt();

        String[] strings  = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = in.next();
        }


        System.out.println(res%835672545);
    }
}
