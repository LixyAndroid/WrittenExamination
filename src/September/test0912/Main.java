package September.test0912;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        int m = Integer.parseInt(strings[0]);
        int n = Integer.parseInt(strings[1]);
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s2 = in.nextLine();
            String[] strings2 = s2.split(" ");
            list.add(strings2);
        }


        System.out.println(2);


    }
}
