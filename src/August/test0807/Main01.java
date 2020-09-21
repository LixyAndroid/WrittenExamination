package August.test0807;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/8/7 09:13
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int k = in.nextInt();
        //next只能取到一个空格前面的
//        String s = in.next();
//        System.out.println(s);

//        //取到一行
//        String sLine = in.nextLine();
//        System.out.println(sLine);
//        //sLine.split(" ")即把sLine按照空格分割成字符串数组
//        String[] s1 = sLine.split(" ");
//        System.out.println(Arrays.toString(s1));


        /*
        数组
        int n = in.nextInt();
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            high[i] = in.nextInt();
        }
         */

//        int n = in.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = in.nextInt();
//        }
        //在输入完所有信息之后就，close
        // in.close();

        /*
        //即输入一行的数组
        Scanner in2 = new Scanner(System.in);

        String postionString = in2.nextLine();

        String[] postionList = postionString.split(" ");
        int[] postion = new  int[postionList.length];

        for (int i = 0; i < postionList.length; i++) {
            postion[i] = Integer.parseInt(postionList[i]);
        }
         */

        Scanner in2 = new Scanner(System.in);
        String s = in2.nextLine();
        String[] stringsArr = s.split(" ");
        int[] sInts = new int[stringsArr.length];
        for (int i = 0; i < sInts.length; i++) {
            sInts[i] = Integer.parseInt(stringsArr[i]);
        }
        System.out.println(Arrays.toString(sInts));
    }

    int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
    /*
    5、为什么返回 left 而不是 right？
    答：都是一样的，因为 while 终止的条件是 left == right。
     */

    //寻找左侧边界的二分查找，最常用
    int binarySearch2(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;

        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return left;
    }

    int binary_search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if(nums[mid] == target) {
                // 直接返回
                return mid;
            }
        }
        // 直接返回
        return -1;
    }

    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 最后要检查 left 越界的情况
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }


    int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定右侧边界
                left = mid + 1;
            }
        }
        // 最后要检查 right 越界的情况
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }
}
