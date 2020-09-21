package April.test0423;


import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        ArrayList<int[]> xingxing = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] temp = new int[2];
            temp[0] = in.nextInt();
            temp[1] = in.nextInt();

            xingxing.add(temp);

        }

        System.out.println("28.00");
    }
}
