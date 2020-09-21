package April.test0415;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/15 19:02
 */
public class Test1 {

    public static void main(String[] args) {
        run1();
    }

    private static String run1() {

        String error01 = "error.0001";

        Scanner in = new Scanner(System.in);

        String str = in.next();
        String[] strings = str.split(",");
        if (strings.length <= 0 || strings.length >= 100) {
             System.out.println(error01);

            return error01;
        }

        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0; i < strings.length; i++) {


            //这里存入，然后map[i]也赋值为1
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }


        }


        String res = strings[0];

        for (int i = 0; i < strings.length; i++) {

            if (map.get(strings[i]) > map.get(res)) {

                res = strings[i];
            } else if (map.get(strings[i]).equals(map.get(res))) {

                res = sort(res, strings[i]);

            }


        }


        System.out.println(res);

        return res;
    }

    public static String sort(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        if (str1Length > str2Length) {
            return sort(str2, str1);
        }

        int n = 0;
        String res = str1;
        while (n < str1Length) {
            if (str1.charAt(n) < str2.charAt(n)) {
                res = str1;
                break;
            } else if (str1.charAt(n) > str2.charAt(n)) {
                res = str2;
                break;
            } else {
                n++;
            }

        }
        return res;

    }


}
