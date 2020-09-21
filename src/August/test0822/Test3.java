package August.test0822;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/22 18:59
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int left = 1;
        List<Integer> moneyList = new ArrayList<>();
        while (left < n) {
            int mid = (left + n) / 2;
            moneyList.add(mid);
            left = mid;
            if (left == n - 1) {
                break;
            }
        }

        if (moneyList.size() <= k) {
            System.out.println(0);
        } else {

            Arrays.sort(moneyList.toArray());
            int sum = 0;
            for (int i = 0; i < moneyList.size() - k; i++) {
                sum += moneyList.get(i);
            }

            System.out.println(sum);

        }
    }
}
