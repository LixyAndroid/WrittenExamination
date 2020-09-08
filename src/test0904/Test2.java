package test0904;

import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }


        int min = ints[0];
        int minIndex = 0;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
                minIndex = i;
            }
        }

        int[] res = new int[ints.length];

        res[minIndex] = 1;
        int l = minIndex;
        int r = minIndex;


        while (l > 0) {
            if (ints[l - 1] > ints[l]) {
                res[l - 1] = res[l] + 1;
            } else if (ints[l - 1] < ints[l]) {
                res[l - 1] = res[l] - 1;
            } else {
                res[l - 1] = res[l] == 1 ? res[l] + 1 : res[l] - 1;
            }
            l--;
        }

        while (r < ints.length - 1) {
            if (ints[r + 1] > ints[r]) {
                res[r + 1] = res[r] + 1;
            } else if (ints[r + 1] < ints[r]) {
                res[r + 1] = res[r] - 1;
            } else {
                res[r + 1] = res[r] == 1 ? res[r] + 1 : res[r] - 1;
            }
            r++;
        }

        int sum = 0;
        for (int i = 0; i < res.length; i++) {

            sum += res[i];
        }
       // System.out.println(Arrays.toString(res));
        System.out.println(sum);

    }

}
