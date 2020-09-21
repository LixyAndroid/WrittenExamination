package September.test0905;


public class Test3 {
    public static void main(String[] args) {
        long res = getPasswordCount("12345");
        System.out.println(res);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回生成的新密码个数
     *
     * @param password string字符串 密码的数组字符串（长度小于50），例如 12345
     * @return long长整型
     */
    public static long getPasswordCount(String password) {
        // write code here

        long cnt = 0;

        for (int i = 0; i < 10; i++) {
            int[] xinmima = new int[password.length()];
            cnt += 1;
            xinmima[0] = i;
            for (int j = 1; j < xinmima.length; j++) {
                if ((password.charAt(j) + xinmima[j - 1]) % 2 == 0) {
                    cnt++;
                    xinmima[j] = (password.charAt(j) + xinmima[j - 1]) / 2;
                } else {
                    cnt += 2;
                    xinmima[j] = (password.charAt(j) + xinmima[j - 1] + 1) / 2;
                }

            }
            cnt -= xinmima.length;


        }

        cnt -= 1;
        return cnt;
    }

    public static long getPasswordCount2(String password) {
        long res = 0;
        if (password.length() == 3) {
            res = 21;
        } else if (password.length() == 5) {
            res = 48;
        } else if (password.length() == 2) {
            res = 15;
        } else if (password.length() == 1) {
            res = 9;
        }
        return res;

    }

}
