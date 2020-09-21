package August.test0808;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/8 15:15
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(in.nextInt());
        }

        int cishu = -1;
        while (!array.isEmpty()) {
            for (int i = 0; i < array.size(); i++) {
                int temp = array.get(i);
                cishu += 1;

                boolean flag = false;
                for (int j = 0; j < array.size(); j++) {
                    if (temp > array.get(j)) {
                        flag = true;
                    }

                }
                if (!flag) {
                    array.remove(i);
                }

            }
        }

        System.out.println(cishu);
    }
}
