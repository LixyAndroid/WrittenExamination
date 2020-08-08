package test0418;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/18 18:43
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] start = new int[n];
        int[] end = new  int[n];


        for (int i = 0; i < n; i++) {
            start[i] = in.nextInt();
            end[i] = in.nextInt();

        }



        int res = n;

        int[] temp = new int[n];
        temp[0] = 0;
        int index = 0;
        while (index<n){

                    for (int i = index; i < n; i++) {

                        if (end[index]<=start[i]){
                            res--;
                            break;
                        }

                    }


            index++;
        }


        System.out.println(res);

    }




}
