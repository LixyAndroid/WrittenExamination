package March.test0306;

import java.util.Arrays;

/**
 * @author Li Xuyang
 * @date 2020/3/6 15:19
 * 年龄排序，
 * 某公司有几万名员工，请完成一个时间复杂度O(n)的算法对该公司员工对年龄做排序，可使用O(1)的辅助空间。
 */
public class AgeSort {
    public static void main(String[] args) {
        int[] ages = new int[] { 23, 45, 32, 43, 21, 24, 43,43,12,32,12,45,32,41,30,30,25, 23, 22, 22, 21 };
        System.out.println("原数组为：" + Arrays.toString(ages));
        AgeSort as = new AgeSort();
        as.sortAge(ages);
        System.out.println("排序后的数组为：" + Arrays.toString(ages));
    }

    private void sortAge(int[] ages) {

        if (ages == null || ages.length < 1) {
            return;
        }
        //限制最大年龄为80岁
        int oldAge = 80;
        int youngAge = 20;

        // 初始化一个odlAge+1的数组
        int[] timeOfAge = new int[oldAge + 1];
        // 将数组元素都置为0
        for (int i = 0; i < timeOfAge.length; i++) {
            timeOfAge[i] = 0;
        }
        // 某个年龄出现了多少次，就在timeOfAge数组对应年龄的位置设置多少次
        for (int j = 0; j < ages.length; j++) {
            int a = ages[j];
            timeOfAge[a]++;
        }

        int index = 0;
        for (int i = youngAge; i <= oldAge; i++) {// 按照年龄从小到大依次遍历timeOfAge
            for (int j = 0; j < timeOfAge[i]; j++) {// 在timeOfAge中取得各个年龄位置记录的出现次数
                ages[index] = i;// 将新数组从头设置出现的年龄，已经排好序
                index++;
            }
        }
    }

        //也可以写成

    public static void sortAge2(int []ages){
        int oldestAge=100;
        int []timesOfAges=new int[oldestAge];

        int len=ages.length;
        for(int i=0;i<len;i++){
            timesOfAges[ages[i]]++;;
        }


        //排序
        int index=0;
        for(int i=0;i<oldestAge;i++){
            for(int j=0;j<timesOfAges[i];j++){

                ages[index]=i;
                index++;
            }
        }


    }
}
