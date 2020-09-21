package May.test0509;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/5/9 23:18
 */
public class BubbleSort {
    public static void main(String[] args) {
          int arr[]={3, 9, -1, 10, -2};

          bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        boolean flag =false;
        for (int i = 0; i < arr.length-1; i++) {

            //这里容易出错，因为最后面的数已经有序了
            for (int j = 0; j < arr.length-1-i; j++) {
                //大数后移
                if (arr[j]>arr[j+1]){

                    temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                    //发生了交换
                    flag = true;
                }
            }

            //这里一个优化，若不发生交换则可以结束了
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }

    }
}
