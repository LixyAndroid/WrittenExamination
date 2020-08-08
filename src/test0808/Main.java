package test0808;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String s = in.next();
        System.out.println(s);

        String sLine = in.nextLine();
        System.out.println(sLine);
        //sLine.split(" ")即把sLine按照空格分割成字符串数组
        String[] s1 = sLine.split(" ");
        System.out.println(Arrays.toString(s1));

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }


        String s2 = in.nextLine();
        String[] stringsArr = s2.split(" ");
        int[] sInts = new int[stringsArr.length];
        for (int i = 0; i < sInts.length; i++) {
            sInts[i] = Integer.parseInt(stringsArr[i]);
        }
    }
}
