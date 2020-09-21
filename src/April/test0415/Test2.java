package April.test0415;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Li Xuyang
 * @date 2020/4/15 20:11
 */
public class Test2 {
    public static void main(String[] args) {
        run2();
    }

    private static void run2() {

        String fail = "FAIL";

        Scanner in = new Scanner(System.in);

        String patten = in.next();
        String str = in.next();


        //拆分没问题
        String[] strings = str.split("],");

        if (strings.length == 0) {
            System.out.println(fail);
            return;
        }


        int cnt = 0;
        for (String string : strings) {

            Pattern p =Pattern.compile(patten);
            Matcher m =p.matcher(string);
            if (m.find()) {
                cnt++;
                for (int j = 0; j < string.length(); j++) {
                    if (string.charAt(j) == 'a' && string.charAt(j + 1) == 'd' && string.charAt(j + 2) == 'd' && string.charAt(j + 3) == 'r') {
                        String addr = string.substring(j + 5, j + 9);
                        System.out.print(addr + " ");
                    }
                    if (string.charAt(j) == 'm' && string.charAt(j + 1) == 'a' && string.charAt(j + 2) == 's' && string.charAt(j + 3) == 'k') {
                        String mask = string.substring(j + 5, j + 9);
                        System.out.print(mask + " ");
                    }
                    if (string.charAt(j) == 'v' && string.charAt(j + 1) == 'a' && string.charAt(j + 2) == 'l') {
                        String val = string.substring(j + 5, j + 9);
                        System.out.print(val + " ");
                    }

                    System.out.println();


                }

            }


        }

        if (cnt==0){
            System.out.println(fail);
        }


    }

}
