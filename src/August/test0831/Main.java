package August.test0831;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();

        int n = str.length();
        int p = 0;
        int q = 0;
        int maxS = 1;
        StringBuilder res = new StringBuilder();
        while (p < n) {
            while (p + 2 * q <= n) {
                if (str.substring(p, p + q).equals(str.substring(p + q, p + 2 * q))) {
                    maxS = Math.max(maxS, q);
                }
                q++;
            }
//            String temp = str.substring(p, p + maxS);
//            Set<Character> set = new HashSet<>();
//            for (int i = 0; i < temp.length(); i++) {
//                set.add(temp.charAt(i));
//            }
//            if (set.size() == 1) {
//                maxS = 1;
//            }

            int count = 1;
            while (p + (count + 1) * maxS <= n && str.substring(p, p + maxS).equals(str.substring(p + count * maxS, p + (count + 1) * maxS))) {
                count++;
            }
            res.append(count).append("(").append(str.substring(p, p + maxS)).append(")");
            p += count * maxS;
            q = 1;
            maxS = 1;
        }

        System.out.println(res);

    }
}
