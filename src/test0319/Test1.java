package test0319;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Li Xuyang
 * @date 2020/3/19 18:57
 */
public class Test1 {
    public static void main(String[] args) {
        run1();
    }

    private static void run1() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nList = new int[n];
        Set<int[]> nListList = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nList[i] = in.nextInt();

        }


        for (int i = 0; i < nList.length; i++) {
            for (int j = 0; j < nList.length; j++) {
                if (i != j) {
                    int value = nList[i];
                    nList[i] = nList[j];
                    nList[j] = value;
                    int[] temp = nList;
                    nListList.add(temp);

                }

            }

        }
        System.out.println(nListList.size());
    }
}
