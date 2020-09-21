package May.test0509;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/5/9 23:36
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={3, 9, -1, 10, -2};


        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr,int left,int right){
        int l = left;//左指针
        int r = right;//右指针

        int pivot = arr[(left+right)/2];//中轴值

        //处理左右两边
        while (l<r){

            //在pivot的左边一直找，找到大于等于pivot的值，才退出

            while (pivot>arr[l]){
                l+=1;
            }

            while (pivot<arr[r]){
                r-=1;
            }



            //如果l>=r 说明pivot的左右两的值，已经按照左边全部满足是
            //小于等于pivot值，右边全部是大于等于pivot值
            if (l>=r){
                break;
            }


            // 这里已经找好 交换即可
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;


            //这里错了
            //如果交换完后，发现arr[l]==pivot，r--,前移
            if (arr[l]==pivot){
                r-=1;
            }

            //如果交换完后，发现arr[r]==pivot,l++,后移
            if (arr[r]==pivot){
                l+=1;
            }





        }

        //如果l==r，必须l++,r--,否则出现栈溢出

        if (l==r){
            l++;
            r--;
        }

        //左递归

        if (left<r){
            quickSort(arr,left,r);
        }


        //右递归
        if (right>l){
            quickSort(arr,l,right);
        }





    }
}
