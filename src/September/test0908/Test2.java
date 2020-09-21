package September.test0908;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/9/8 18:23
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            res.append(s.substring(i + 1, j + 1) + " ");

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }

        System.out.println(res.toString().trim());

    }


}
