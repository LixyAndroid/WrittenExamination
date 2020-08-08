package test0425;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/25 09:54
 */
public class Main1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        in.close();
        System.out.println(decode(s));



    }


    public static String decode(String words) {

        while (words.contains("]")) {
            //返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
            int right = words.indexOf("]");
            /*
            public int lastIndexOf(int ch): 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。

            public int lastIndexOf(int ch, int fromIndex): 返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索，如果此字符串中没有这样的字符，则返回 -1。

            public int lastIndexOf(String str): 返回指定子字符串在此字符串中最右边出现处的索引，如果此字符串中没有这样的字符，则返回 -1。

            public int lastIndexOf(String str, int fromIndex): 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索，如果此字符串中没有这样的字符，则返回 -1。
             */
            int left = words.lastIndexOf("[",right);
            String repeatStr = words.substring(left + 1, right);
            String[] split = repeatStr.split("\\|");
        //  replace 方法 有两个String对象的创建，还有一个StringBuilder
            words = words.replace("[" + repeatStr + "]", String.join("", Collections.nCopies(Integer.parseInt(split[0]), split[1])));
        }

        return words;

    }
}
