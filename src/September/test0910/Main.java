package September.test0910;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4};
        double res = method(arr1, arr2);
        System.out.println(res);
    }

    public static double method(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int index = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < res.length; i++) {

            if (index1 < arr1.length && index2 < arr2.length) {
                if (arr1[index1] < arr2[index2]) {
                    res[i] = arr1[index1];
                    index1 += 1;
                } else {
                    res[i] = arr2[index2];
                    index2 += 1;
                }
                index++;
            }
        }

        if (index1 < arr1.length) {
            for (int i = index; i < res.length; i++) {
                res[i] = arr1[index1];
                index1++;
            }
        }

        if (index2 < arr2.length) {
            for (int i = index; i < res.length; i++) {
                res[i] = arr2[index2];
                index2++;
            }
        }


        System.out.println(Arrays.toString(res));

        int len = res.length;

        return len % 2 == 1 ? res[len / 2] : (res[(len - 1) / 2] + res[len / 2]) / 2.0;

    }
}
