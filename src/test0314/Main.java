package test0314;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/14 18:56
 */
public class Main {

    /*


    牛牛总是睡过头，所以他定了很多闹钟，只有在闹钟响的时候他才会醒过来并且决定起不起床。从他起床算起他需要X分钟到达教室，上课时间为当天的A时B分，请问他最晚可以什么时间起床

    输入描述:
    每个输入包含一个测试用例。
    每个测试用例的第一行包含一个正整数，表示闹钟的数量N(N<=100)。
    接下来的N行每行包含两个整数，表示这个闹钟响起的时间为Hi(0<=A<24)时Mi(0<=B<60)分。
    接下来的一行包含一个整数，表示从起床算起他需要X(0<=X<=100)分钟到达教室。
    接下来的一行包含两个整数，表示上课时间为A(0<=A<24)时B(0<=B<60)分。
    数据保证至少有一个闹钟可以让牛牛及时到达教室。


    输出描述:
    输出两个整数表示牛牛最晚起床时间。
     */

    /*
    由于上面创建了很多闹钟对象，比较费空间，所以我们可以将输入的时间全部转换成分钟，
    比如6时10分=6*60+10=370分，然后将输入的时间排序（快排时间复杂度为O（nlog2n），然后二分，思路和上面一样
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            list.add(scanner.nextInt() * 60 + scanner.nextInt());
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }
        );
        int X = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int AB = A * 60 + B; // 上课时间，转换成了分钟
        int t = AB - X; // 这就是标杆
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            //二分查找
            int m = (l + r) >> 1;
            if (t >= list.get(m)) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (r < 0){
            System.out.println(list.get(0) / 60 + " " + list.get(0) % 60);

        }
        else{
            System.out.println(list.get(r) / 60 + " " + list.get(r) % 60);

        }
        scanner.close();
    }


}
