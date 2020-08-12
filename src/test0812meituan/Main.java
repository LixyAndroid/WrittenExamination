package test0812meituan;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/8/12 12:18
 * 三数字之和，最接近tar
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 8, 10, 6, 9, 8};
        int[] res = method4(arr, 30);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
        System.out.println(Arrays.toString(res));
    }

    //原代码,不正确
    public static int[] method(int[] arr, int tar) {
        int[] res = new int[3];
        res[0] = arr[0];
        res[1] = arr[1];
        res[2] = arr[2];
        int sum = Math.abs((arr[0] + arr[1] + arr[2]) - tar);
        for (int i = 3; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (Math.abs((arr[i] + arr[j] + arr[k]) - tar) < sum) {
                        res[0] = arr[i];
                        res[1] = arr[j];
                        res[2] = arr[k];
                    }
                }
            }
        }
        return res;
    }

    //优化
    public static int[] method2(int[] arr, int tar) {
        int[] res = new int[3];
        res[0] = arr[0];
        res[1] = arr[1];
        res[2] = arr[2];
        int sum = Math.abs((arr[0] + arr[1] + arr[2]) - tar);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int k = 2; k < arr.length; k++) {
                    if (i != j && i != k && j != k && Math.abs((arr[i] + arr[j] + arr[k]) - tar) < sum) {
                        res[0] = arr[i];
                        res[1] = arr[j];
                        res[2] = arr[k];
                        //更新
                        sum = Math.abs((arr[i] + arr[j] + arr[k]) - tar);
                    }
                }
            }
        }
        return res;
    }

    //时间复杂度优化
    public static int[] method3(int[] arr, int tar) {
        //先排序,这里好烦，要想到时间复杂度已经超了n2了还不排序吗
        Arrays.sort(arr);
        int[] res = new int[3];
        res[0] = arr[0];
        res[1] = arr[1];
        res[2] = arr[2];
        int sum = Math.abs(arr[0] + arr[1] + arr[2] - tar);
        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1, r = arr.length - 1;
            while (l < r) {

                if (arr[i] + arr[l] + arr[r] < tar) {
                    l++;
                } else if (arr[i] + arr[l] + arr[r] > tar) {
                    r--;
                } else {
                    if (i != l && i != r) {
                        res[0] = arr[i];
                        res[1] = arr[l];
                        res[2] = arr[r];
                        return res;
                    }
                }
                if (Math.abs(arr[i] + arr[l] + arr[r] - tar) < sum) {
                    if (i != l && i != r && l != r) {
                        res[0] = arr[i];
                        res[1] = arr[l];
                        res[2] = arr[r];
                    }
                }
            }
        }
        return res;
    }

    //排序，滑动窗口
    public static int[] method4(int[] arr, int tar) {
        //先排序,这里好烦，要想到时间复杂度已经超了n2了还不排序吗
        Arrays.sort(arr);
        int[] res = new int[3];
        int i = 0, j = 1, k = 2;
        res[i] = arr[i];
        res[j] = arr[j];
        res[k] = arr[k];
        for (int l = 0; l < arr.length; l++) {
            if (arr[i] + arr[j] + arr[k] < tar) {
                if (k < arr.length - 1) {
                    i++;
                    j = k;
                    k++;
                }
            } else if (arr[i] + arr[j] + arr[k] == tar) {
                res[0] = arr[i];
                res[1] = arr[j];
                res[2] = arr[k];
                return res;
            } else if (arr[i] + arr[j] + arr[k] > tar) {
                if (i > 0) {
                    k--;
                    j = i;
                    i--;
                }
            }
        }
        res[0] = arr[i];
        res[1] = arr[j];
        res[2] = arr[k];
        return res;
    }
}

