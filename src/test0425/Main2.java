package test0425;


import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/25 13:13
 */
public class Main2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            high[i] = in.nextInt();
        }

        in.close();

        int[] res = decode(high);

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }

    }

    public static int[] decode(int[] arr) {

        int[] res = new int[arr.length];


        int index = 0;
        while (index < arr.length) {


            int cnt = 2;
            int curMaxqian = 0;
            int curMaxhou = 0;
            if (index == 0) {
                curMaxqian = arr[index];
                curMaxhou = arr[index + 1];
            } else if (index == arr.length - 1) {
                curMaxqian = arr[index - 1];
                curMaxhou = arr[index];
            } else {
                cnt += 1;
                curMaxqian = arr[index - 1];
                curMaxhou = arr[index + 1];
            }

            //前

            for (int i = index - 2; i >= 0; i--) {

                if (arr[i] > curMaxqian) {
                    cnt += 1;
                    curMaxqian = arr[i];
                }

            }

            //后


            for (int i = index + 2; i < arr.length; i++) {

                if (arr[i] > curMaxhou) {
                    cnt += 1;
                    curMaxhou = arr[i];
                }

            }


            res[index] = cnt;


            index++;
        }


        return res;

    }
}
