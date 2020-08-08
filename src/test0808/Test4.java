package test0808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/8 15:15
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(array[i]);
        }

        boolean flag = false;
        while (!flag) {
            for (int i = 0; i < list.size(); i++) {

                if (i + 1 < list.size() && list.get(i).equals(list.get(i + 1))) {
                    list.set(i, list.get(i) + 1);
                    list.remove(i + 1);
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
            flag = false;

        }

        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res = Math.max(res, list.get(i));
        }

        System.out.println(res);

    }
}
