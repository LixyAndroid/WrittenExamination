package April.test0417;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/17 18:51
 */
public class Test1 {

    public static void main(String[] args) {
        run1();
    }

    private static void run1() {

        Scanner in = new Scanner(System.in);


        double n = 0;
        int m = 0;
        double sum = 0;

        while (in.hasNext()) {

            n = in.nextInt();
            m = in.nextInt();


//
            for (int i = 0; i < m; i++) {
                sum += sum + n;
                n = Math.sqrt(n);

            }


            System.out.printf("%.2f", sum);
            System.out.println();


        }


    }

}
