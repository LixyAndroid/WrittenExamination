package test0425;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/4/25 15:55
 */
public class Main3 {
    public static void resolve(int arr[], int left, int right, int[] temp,
                               long[] result, long[][] dp, int index) {
        if (left < right) {
            int mid = left + right >> 1;
            resolve(arr, left, mid, temp, result, dp, index - 1);
            resolve(arr, mid + 1, right, temp, result, dp, index - 1);
            merge(arr, left, mid, right, temp, result, dp, index);
        }
    }

    public static void merge(int arr[], int left, int mid, int right, int[] temp,
                             long[] result, long[][] dp, int index) {
        int i = left;
        int j = mid + 1;
        int tempLeft = 0;

        long max = 0;
        long equal = 0;
        while (i <= mid && j <= right)
            if (arr[i] <= arr[j]) {
                max += j - mid - 1;
                if (arr[i] == arr[j]) {
                    equal++;
                    int ind = j + 1;
                    while (ind <= right && arr[j] == arr[ind++])
                        equal++;
                }
                temp[tempLeft++] = arr[i++];
            } else {
                temp[tempLeft++] = arr[j++];
            }
        while (i <= mid) {
            max += right - mid;
            temp[tempLeft++] = arr[i++];
        }
        while (j <= right) {
            temp[tempLeft++] = arr[j++];
        }
        result[0] += max;
        dp[index][0] += max;
        dp[index][1] += (long)(right - mid) * (right - mid) - max - equal;

        tempLeft = left;
        i = 0;
        while (tempLeft <= right)
            arr[tempLeft++] = temp[i++];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int total = n == 0 ? 1 : 2 << n - 1;
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        long[] result = {0};
        long[][] dp = new long[n][2];

        int[] temp = new int[total];
        resolve(arr, 0, total - 1, temp, result, dp, n - 1);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int qn = scanner.nextInt() - 1;
            if (i == 0 || qn != -1) {
                int index = 0;
                while (index <= qn) {
                    long tem = dp[index][0];
                    dp[index][0] = dp[index][1];
                    dp[index][1] = tem;
                    result[0] += dp[index][0] - dp[index][1];
                    index++;
                }
            }
            builder.append(result[0] + "\n");
        }
        System.out.print(builder);
    }
}
