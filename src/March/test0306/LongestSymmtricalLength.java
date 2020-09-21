package March.test0306;

/**
 * @author Li Xuyang
 * @date 2020/3/6 15:36
 * 输入一个字符串，输出该字符串中对称的子字符串最大长度，比如输入字符串“google”,由于该字符串里最长的对称子字符串是“goog”,因此输出4。
 */
public class LongestSymmtricalLength {


    public static void main(String[] args) {
        String str = "googleelgoogadwc";
        System.out.println(longestSymmtricalLength(str));
    }



    /*
     * consider this string:
     * ..aAa..(A represents a string of any length)
     * if we already know 'A' is a palindrome,
     * we just need to test if the char before 'A' and that after 'A' are the same
     * if so,A=aAa now.
     * Do it again and again to find the result.
     */


    /*

     *考虑这个字符串：

     *...aAa...（A表示任意长度的字符串）

     *如果我们已经知道A是回文，

     *我们只需要测试A之前的字符和A之后的字符是否相同

     *如果是，现在A=aAa。

     *一次又一次地去寻找结果。

     */
    public static int longestSymmtricalLength(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        int symLen = 1;
        char[] letter = str.toCharArray();
        int strLen = str.length();
        int curIndex = 1;
        while (curIndex > 0 && curIndex < strLen - 1) {
            //odd symmetrical length,the 'pivot' char is letter[curIndex]
            int i = curIndex - 1;
            int j = curIndex + 1;
            while (i >= 0 && j <= (strLen - 1) && letter[i] == letter[j]) {
                i--;
                j++;
            }
            int newLen = j - i - 1;
            if (newLen > symLen) {
                symLen = newLen;
            }
            //even symmetrical length,the 'pivot' chars are letter[curIndex] and letter[curIndex+1]
            i = curIndex;
            j = curIndex + 1;
            while (i >= 0 && j <= (strLen - 1) && letter[i] == letter[j]) {
                i--;
                j++;
            }
            newLen = j - i - 1;
            if (newLen > symLen) {
                symLen = newLen;
            }
            curIndex++;
        }
        return symLen;
    }


}
