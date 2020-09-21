package March.test0315;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/15 19:48
 */
public class Test2 {
    public static void main(String[] args) {
        run2();
    }

    private static void run2() {

        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int W = in.nextInt();


        Scanner in2 = new Scanner(System.in);

        String postionString = in2.nextLine();

        String[] postionList = postionString.split(" ");
        int[] postion = new int[postionList.length];

        for (int i = 0; i < postionList.length; i++) {
            postion[i] = Integer.parseInt(postionList[i]);
        }


        System.out.println(Arrays.toString(postion));
        String supplyString = in2.nextLine();


        String[] supplyList = supplyString.split(" ");
        int[] supply = new int[supplyList.length];

        for (int i = 0; i < supplyList.length; i++) {
            supply[i] = Integer.parseInt(supplyList[i]);
        }


        int shengyushui = W;

        int shengyuLength = D;
        int xuyaoshuo = D-W;

        int index = 0;

        for (int i = 0; i < supply.length; i++) {
            index++;

                if (i == 0) {
                    xuyaoshuo = postion[0];
                    shengyushui = shengyushui - postion[0] + supply[i];
                } else {
                    if (i+1<supply.length){
                        xuyaoshuo = postion[i+1] - postion[i];
                    }else {
                        xuyaoshuo = D-postion[i];
                    }


                    shengyushui = shengyushui - (postion[i] - postion[i - 1]) + supply[i];
                }


                shengyuLength = D - postion[i];
                if (shengyushui > shengyuLength) {
                    break;
                }
                if (xuyaoshuo>shengyushui){
                    index=-1;
                }



        }


        System.out.println(index);

        in.close();
        in2.close();
    }
}
