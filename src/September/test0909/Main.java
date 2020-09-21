package September.test0909;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double res = pow(1.1, 100);
        System.out.printf("%.5f", res);
    }

    public static double pow(double x, int n) {

        // Java 代码中 int32 变量n∈[−2147483648,2147483647] ，因此当n=−2147483648 时执行n=−n 会因越界而赋值出错。解决方法是先将 n 存入 long 变量 b
        // 后面用 b 操作即可。

        if (x == 0.0) {
            return 0.0;
        }
        double res = 1.0;
        long b = n;

        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if (b % 2 == 1) {
                res *= x;
            }
            x *= x;
            b /= 2;
        }

        return res;
    }
}
