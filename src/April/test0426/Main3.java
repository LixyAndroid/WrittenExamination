package April.test0426;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < N+1; i++) {

            String s = in.nextLine();
            String[] s1 = s.split(" ");


            int[] temp = new int[s1.length];

            for (int j = 1; j < s1.length; j++) {
                temp[j-1] = Integer.parseInt(s1[j]);
            }

            arrayList.add(temp);


        }

        in.close();


        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = 0; j < arrayList.get(i).length; j++) {
                integers.add(arrayList.get(i)[j]);
            }

        }


        int[] res = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            res[i] = integers.get(i);
        }

        Arrays.sort(res);

        for (int i = res.length-1; i >res.length-K-1; i--) {
            System.out.print(res[i]+" ");
        }

    }
}
