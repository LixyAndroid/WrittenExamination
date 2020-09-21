package September.test0916;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/9/16 15:13
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.substring(1, s.length() - 1);
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int res = 0;
        for (int v : count) {
            res += v / 2 * 2;
            if (v % 2 == 1 && res % 2 == 0) {
                res++;
            }
        }
        System.out.println(res);
    }

}
