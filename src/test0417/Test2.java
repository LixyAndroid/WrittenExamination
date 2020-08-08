package test0417;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/17 19:31
 */
public class Test2 {
    public static void main(String[] args) {
        run2();
    }

    private static void run2() {

        Scanner in =new  Scanner(System.in);

        int n = 0;
        int m = 0;

        boolean flag = false;
        while (in.hasNext()){
            m = in.nextInt();
            n = in.nextInt();

            int index = m;

            ArrayList<Integer> resList = new ArrayList<>();

            while (index<=n){

                if (judge(index)){


                    resList.add(index);
                }

                index++;
            }

            if (resList==null||resList.size()==0){
                System.out.println("no");
            }else {

                for (int i = 0; i < resList.size(); i++) {

                    if (i==resList.size()-1){
                        System.out.print(resList.get(i));
                    }else {
                        System.out.print(resList.get(i)+" ");
                    }
                }
            }

        }

    }

    public static boolean judge(int num){


        int res = 0;
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100%10;

        res = ge*ge*ge+shi*shi*shi+bai*bai*bai;
        return res == num;


    }
}
