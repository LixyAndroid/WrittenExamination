package test0416;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/4/16 15:59
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {

        //记得一定要优化

        //临时变量
        int temp = 0;
        //标示变量，表示是否进行过交换
        boolean flag = false;

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    flag = true;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

            //优化
            if (!flag) { //在一趟排序中，一次交换都没有发生
                break;
            }else {
                flag = false;  //重置flag,进行下次判断
            }

        }


    }


    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 8, 2, 4, 5, 3, 2, 4, 5};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
