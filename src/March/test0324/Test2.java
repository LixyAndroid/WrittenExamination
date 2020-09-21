package March.test0324;

/**
 * @author Li Xuyang
 * @date 2020/3/24 15:09
 */
public class Test2 {
    public static void main(String[] args) {

        String str1 = "1111111";
        String str2 = "100111111";


        Test2 test2 = new Test2();
        String res = test2.addBinary(str1, str2);
        System.out.println(res);
        System.out.println(test2.addBinary2(str1, str2));

    }


    public String addBinary(String a, String b) {

        //默认处理a长b短
        int n = a.length(), m = b.length();
        //这样就处理了 b长 a短情况
        if (n < m) return addBinary(b, a);
        //取最长的
        int L = Math.max(n, m);

        //用StringBuilder
        /*
        若用String的话，就会创建一个新的，就很慢，所以用StringBuilder
        javac会把 str += "b"; 变成一个StringBuilder的append 操作。
        相当于一个 new StringBuilder().append("a").append("b").toString().

          比自己调用append费事多了。
         */
        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;
        //逆序遍历
        for (int i = L - 1; i > -1; --i) {
            //a 为1
            if (a.charAt(i) == '1') {
                ++carry;
            }

            //b 也为1
            if (j > -1 && b.charAt(j--) == '1') {
                ++carry;
            }

            //如果不为2 ,就append 0， 否则就append 1
            if (carry % 2 == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            //carry 还要除以2,继续下次的
            carry /= 2;
        }
        //如果相加完，还是为1，说明需要进位，就是继续追加
        if (carry == 1) sb.append('1');

        //StringBuilder 的方法，反转
        sb.reverse();


        return sb.toString();

    }


    public String addBinary2(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0; //是否进一位
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            //这里的思想就是短的则用0不齐
            sum += (i >= 0 ? a.charAt(i) - '0' : 0); // 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
            sum +=( j >= 0 ? b.charAt(j) - '0' : 0);// 获取字符串a对应的某一位的值 当j<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
            ans.append(sum % 2);  //如果二者都为1  那么sum%2应该刚好为0 否则为1
            ca = sum / 2;   //如果二者都为1  那么ca 应该刚好为1 否则为0
        }
        ans.append(ca == 1 ? ca : "");// 判断最后一次计算是否有进位  有则在最前面加上1 否则原样输出
        return ans.reverse().toString();
    }
}
