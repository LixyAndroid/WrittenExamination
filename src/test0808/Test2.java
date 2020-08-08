package test0808;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/8 15:14
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] temp = new int[2];
            temp[0] = in.nextInt();
            temp[1] = in.nextInt();
            list.add(temp);
        }

        int waimaijiazhi = 0;
        int fukuaijine = 0;
        for (int i = 0; i < list.size(); i++) {
            //白嫖
            if (list.get(i)[1] >= list.get(i)[0]) {
                waimaijiazhi += list.get(i)[1];
            } else {
                waimaijiazhi += list.get(i)[0];
                fukuaijine += (list.get(i)[0] - list.get(i)[1]);
            }

        }
        in.close();

        System.out.println(waimaijiazhi + " " + fukuaijine);

    }
}
