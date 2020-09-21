package March.test0315;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/15 21:45
 */
public class LearnScanner {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int D = in.nextInt();
        int W = in.nextInt();



        Scanner in2 = new Scanner(System.in);

        String postionString = in2.nextLine();

        String[] postionList = postionString.split(" ");
        int[] postion = new  int[postionList.length];

        for (int i = 0; i < postionList.length; i++) {
            postion[i] = Integer.parseInt(postionList[i]);
        }



        String supplyString = in2.nextLine();


        String[] supplyList = supplyString.split(" ");
        int[] supply = new  int[supplyList.length];

        for (int i = 0; i < supplyList.length; i++) {
            supply[i] = Integer.parseInt(supplyList[i]);
        }


        System.out.println(D);

        System.out.println(W);
        System.out.println(Arrays.toString(postion));

        System.out.println(Arrays.toString(supply));
        in.close();
        in2.close();


    }


}
