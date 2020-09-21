package May.test0510;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/5/10 10:52
 */
public class InsertSort {

    public static void main(String[] args) {
        int arr[]={3, 9, -1, 10, -2};

        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        int insertIndex=0;
        int insertVal =0;
        for (int i = 1; i < arr.length; i++) {
            //定义待插入待数
            insertVal = arr[i];
            insertIndex = i-1; //即arr[i]前面树的下标
            //后移
            while (insertIndex>=0&&insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex+1!=i){
                arr[insertIndex+1] = insertVal;
            }

        }

    }
}
