package test0903;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x0 = in.nextInt();
        int y0 = in.nextInt();


        String sLine = in.next();
        for (int i = 0; i < sLine.length(); i++) {
            if (sLine.charAt(i) == 'U') {
                y0++;
            } else if (sLine.charAt(i) == 'D') {
                y0--;
            } else if (sLine.charAt(i) == 'L') {
                x0--;
            } else if (sLine.charAt(i) == 'R') {
                x0++;
            }

        }
        System.out.println(x0 + " " + y0);
    }
}
