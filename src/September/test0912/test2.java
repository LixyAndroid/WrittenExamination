package September.test0912;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/9/12 15:28
 */
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        String s = in.nextLine();
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
             getSubList(s, i, i,list);
             getSubList(s, i, i + 1,list);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()>1){
                res++;
            }
        }

        System.out.println(res);
    }


    public static void getSubList(String s, int left, int right, ArrayList<String> list) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            String subString = s.substring(left, right + 1);
            list.add(subString);
            left--;
            right++;
        }
    }
}
