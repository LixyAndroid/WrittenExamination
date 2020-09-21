package August.test0807;

import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/7 18:14
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sLine = in.nextLine();
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = in.next();
        }

        boolean flag;
        do {
            flag = false;
            for (String string : strings) {
                if (sLine.contains(string)) {
                    flag = true;
                    sLine = sLine.replaceFirst(string, "");
                }
            }
        } while (flag);

        System.out.println(sLine);

    }
}
