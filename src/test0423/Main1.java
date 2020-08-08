package test0423;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();




        ArrayList<int[]> xingxing = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] temp = new int[2];
            temp[0] = in.nextInt();
            temp[1] = in.nextInt();

            xingxing.add(temp);

        }

        int cnt = 0;

        int index = 0;

        boolean shang = false;
        boolean xia = false;
        boolean zuo = false;
        boolean you = false;
        while (index < n) {

            Set<int[]> set = new HashSet<>();
            //4个点不能重复
            for (int i = 0; i < n; i++) {
                if (xingxing.get(i)[0] > xingxing.get(index)[0]) {
                    you = true;
                    set.add(xingxing.get(i));
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (xingxing.get(i)[0] < xingxing.get(index)[0]) {
                    zuo = true;
                    set.add(xingxing.get(i));
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if (xingxing.get(i)[1] > xingxing.get(index)[1]) {
                    shang = true;
                    set.add(xingxing.get(i));
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if (xingxing.get(i)[1] < xingxing.get(index)[1]) {
                    xia = true;
                    set.add(xingxing.get(i));
                    break;
                }
            }




            if (shang && xia && zuo && you&&set.size()==4) {
                cnt++;
            }


            index++;

            shang = false;
            xia = false;
            zuo = false;
            you = false;

        }


        System.out.println(cnt);


    }
}
