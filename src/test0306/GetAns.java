package test0306;

/**
 * @author Li Xuyang
 * @date 2020/3/6 15:43
 * 输入一个正数n,输出所有和为n连续正数序列，例如输入有15，由于1+2+3+4+5=4+5+6=7+8=15，所以输出3个连续序列1-5、4-6、7-8.
 */
public class GetAns {

    //输出一到n中连续和为n的正整数
    public static void getAns(int n) {
        int beg = 1;
        int sum = 1;
        int cur = 1;

        while (beg <= n / 2 + 1) {

            if (sum == n) {
                for (int k = beg; k <= cur; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
                sum = sum - beg;
                beg++;
                cur++;
                sum += cur;

            }
            if (sum > n) {

                sum = sum - beg;
                beg++;

            } else {
                cur++;
                sum += cur;
            }
           // System.out.println("beg: " + beg + "cur: " + cur + "sum: " + sum);


        }


    }

    public static void main(String[] args) {
        getAns(15);


    }
}
