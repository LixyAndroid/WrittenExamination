package April.test0425;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/26 14:26
 * 视野争夺
 */
public class Main5 {

    /*
    小Q在进行一场竞技游戏,这场游戏的胜负关键就在于能否能争夺一条长度为L的河道,即可以看作是[0,L]的一条数轴。
    这款竞技游戏当中有n个可以提供视野的道具−真视守卫,第i个真视守卫能够覆盖区间[xi,yi]。现在小Q想知道至少用几个真视守卫就可以覆盖整段河道。

    输入描述:
    输入包括n+1行。

    第一行包括两个正整数n和L(1<=n<=105,1<=L<=109)

    接下来的n行,每行两个正整数xi,yi(0<=xi<=yi<=109),表示第i个真视守卫覆盖的区间。


    输出描述:
    一个整数，表示最少需要的真视守卫数量, 如果无解, 输出-1。

    输入例子1:
    4 6
    3 6
    2 4
    0 2
    4 7

    输出例子1:
    3
     */

    //这道题的关键是对于视野范围的进行排序，从最小的开始
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int L = in.nextInt();

        int[][] ints = new int[n][2];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2; j++) {
                ints[i][j] = in.nextInt();
            }
        }

        in.close();

        //获得数组，进行排序
        Arrays.sort(ints, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });

        int count = 0;
        int pre=0;//右边界
        int index =0;
        while (pre<L){

            if (ints[index][0]>pre){
                System.out.println(-1);
            }

            int max =0;
            while (index<n&&ints[index][0]<=pre){

                max = Math.max(max,ints[index][1]);
                index++;
            }

            count++;
            pre=max;
            if (pre>=L){
                System.out.println(count);
                return;
            }

            if (index>=n){
                System.out.println(-1);
                return;
            }
        }

    }
}
