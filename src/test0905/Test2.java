package test0905;

public class Test2 {
    public static void main(String[] args) {
        int[] xa = {-1, 4};
        int res = getHouses(2, xa);
        System.out.println(res);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能创建的房屋数
     *
     * @param t  int整型 要建的房屋面宽
     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
     * @return int整型
     */
    public static int getHouses(int t, int[] xa) {
        // write code here

        //x0的左面肯定是可以建的 可以吧res 直接赋值为1
        int res = 1;
        for (int i = 0; i < xa.length - 3; i += 2) {
            double leftI = xa[i] + xa[i + 1] / 2.0;
            double rightI1 = xa[i + 2] - xa[i + 3] / 2.0;
            if (rightI1 - leftI > t) {
                res += 2;
            } else if (rightI1 - leftI == t) {
                res += 1;
            }

        }
        //最右边
        res += 1;
        return res;
    }
}
