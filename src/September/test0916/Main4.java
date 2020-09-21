package September.test0916;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/9/16 21:18
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(deleteMinChar(s));
    }

    private static String deleteMinChar(String s) {
        //统计
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        int minCount = 101;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
            }
        }

        char[] char_array = new char[s.length()];
        int index_char_array = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) > minCount) {
                char_array[index_char_array++] = s.charAt(i);
            }
        }

        return new String(char_array).trim();
    }

}
