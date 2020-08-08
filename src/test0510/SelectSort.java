package test0510;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/5/10 11:53
 */
public class SelectSort {
    public static void main(String[] args) {
        int arr[]={3, 9, -1, 10, -2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){


        for (int i = 0; i < arr.length-1; i++) {
           int min = arr[i];
           int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }

            }


            //将最小值，放在arr[i],即交换,赋值
            if (minIndex!=i){

                //把当前值给到这个找到到minIndex
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }


    }
}
