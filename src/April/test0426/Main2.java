package April.test0426;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] zuobiao = new int[n];

        for (int i = 0; i < n; i++) {
            zuobiao[i]=in.nextInt();
        }

        int[][] temp=new int[m][2];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < 2; j++) {
                temp[i][j] = in.nextInt();
            }
        }

        in.close();


        //获得数组，进行排序
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });


        int count = 1;
        int pre=1;//右边界
        int index =0;

            while (index<n){

                if (zuobiao[index]==0){

                    for (int i = index; i < m; i++) {

                        if (temp[i][0]==pre){
                            if (zuobiao[temp[i][1]]==1){
                                pre=temp[i][1];
                                count++;
                                index=pre;
                                if (pre==n){
                                    break;
                                }

                            }


                        }
                    }



                }else {
                    for (int i = index; i < m; i++) {
                        if (temp[i][0]==pre){
                            if (zuobiao[temp[i][1]]==1){
                                pre=temp[i][1];
                                index=pre;
                                count++;
                                if (pre==n){
                                    break;
                                }

                            }


                        }
                    }
                }

                index++;
                if (pre==n){
                    break;
                }
            }


            if (count==1){
                System.out.println(-1);
            }else {
                System.out.println(count);
            }






    }
}
