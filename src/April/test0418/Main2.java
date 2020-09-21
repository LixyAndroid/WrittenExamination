package April.test0418;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/18 18:43
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        String POSSIBLE = "POSSIBLE";
        String IMPOSSIBLE = "IMPOSSIBLE";

        for (int i = 0; i < t; i++) {


            int[] changkuan = new int[12];

            for (int j = 0; j < 12; j++) {
                changkuan[j] = in.nextInt();
            }

            int[] mianji = new int[6];

            int index = 0;

            for (int j = 0; j < mianji.length; j++) {

                mianji[j] = changkuan[index] * changkuan[index + 1];
                index += 2;

            }
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();

            for (int j = 0; j < changkuan.length; j++) {
                set1.add(changkuan[j]);

            }
            for (int j = 0; j < mianji.length; j++) {
                set2.add(mianji[j]);
            }

            if (set1.size() <= 3 && set2.size() <= 3 && set1.size() == set2.size()) {
                System.out.println(POSSIBLE);
            } else {
                System.out.println(IMPOSSIBLE);
            }


        }

    }
}
