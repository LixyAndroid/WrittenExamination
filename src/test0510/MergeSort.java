package test0510;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/5/10 22:45
 */
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={3, 9, -1, 10, -2};
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if (left<right){

            //中间索引
            int mid = (left+right)/2;
            //向左递归进行分解
            mergeSort(arr,left,mid,temp);
            //向右递归分解
            mergeSort(arr,mid+1,right,temp);

            //合并
            merge(arr,left,mid,right,temp);


        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {

        //初始化i,左边有序序列的初始索引
        int i = left;
        //初始化j,右边有序序列的初始索引
        int j = mid+1;

        //指向temp数组的当前索引
        int t =0;
        // 1
        while (i<=mid&&j<=right){
           if (arr[i]<=arr[j]){
               temp[t] = arr[i];
               t+=1;
               i+=1;
           }else {
               temp[t] = arr[j];
               t+=1;
               j+=1;
           }

        }

        //2,剩余的
        while (i<=mid){
            temp[t] = arr[i];
            t+=1;
            i+=1;
        }

        while (j<=right){
            temp[t] = arr[j];
            t+=1;
            j+=1;
        }

        //3,拷贝
        t=0;
        int tempLeft = left;
        while (tempLeft<=right){
            arr[tempLeft] =temp[t];
            t+=1;
            tempLeft+=1;
        }


    }
}
