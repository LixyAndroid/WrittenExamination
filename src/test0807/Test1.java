package test0807;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/7 18:14
 * 阿里巴巴笔试题
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 0);
            }
            arr[i] = num;
        }

        int max = 0;
        for (int i = 0; i < map.size(); i++) {
            max = Math.max(max, map.get(arr[i]));
        }

        int all = (n - 1 - max) % (int) (Math.pow(10, 9) + 7);

        System.out.println(all);


    }
}
