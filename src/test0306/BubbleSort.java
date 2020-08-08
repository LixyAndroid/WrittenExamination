package test0306;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/3/4 20:41
 * 冒泡排序 待改进,不稳定
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3, 8, 0, 232, 41, 66, 1, 4};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));


    }


    public static void bubbleSort(int[] arr) {

        //定义交换变量
        int temp = 0;

        //标识变量，表示是否进行过交换
        boolean flag = false;

        for (int i = 0; i < arr.length - 1; i++) {

            //这里很关键
            for (int j = 0; j < arr.length - 1-i; j++) {

                if (arr[j] > arr[j + 1]) {

                    flag = true;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
            if (!flag) {
                break;
            }else {
                flag = false;
            }
        }


    }
}