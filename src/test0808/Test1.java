package test0808;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/8 15:14
 * 美团笔试题
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int num = 0;
        for (int i = 0; i < 5; i++) {
            int k = in.nextInt();
            num += k;
            sum += k * (i + 1);
        }
        in.close();
        //保留一位小数
        double res = new BigDecimal(sum / num).setScale(1, RoundingMode.DOWN).doubleValue();

        System.out.println(res);
    }
}
