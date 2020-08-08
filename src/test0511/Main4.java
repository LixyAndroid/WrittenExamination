package test0511;

import java.util.HashSet;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        fun();
    }

    private static void fun() {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        int N = in.nextInt();

        int[] ints = new int[N];
        int[] ints1 = new int[N];
        String[] string2 = new String[N];
        for (int i = 0; i < N; i++) {
            ints[i] = in.nextInt();
            ints1[i] = in.nextInt();
            string2[i] = in.next();
        }

        in.close();

        for (int i = 0; i < N; i++) {

            if (ints[i] == 1) {

                stringBuilder.replace(ints1[i]-1,ints1[i],string2[i]);
            }

            if (ints[i] == 2) {
                HashSet<Character>set = new HashSet<>();

                for (int j = ints1[i]; j <=Integer.parseInt(string2[i]) ; j++) {
                    set.add(stringBuilder.charAt(j-1));
                }
                System.out.println(set.size());
            }

        }


    }
}
