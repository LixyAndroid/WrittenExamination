package May.test0502;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Li Xuyang
 * @date 2020/5/2 10:01
 */
public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();

        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < len; i++) {
            //包括该字符，则更新起始位置
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            ans = Math.max(ans, i - j + 1);

            map.put(s.charAt(i), i + 1);
        }

        return ans;

    }

    public static int lengthOfLongestSubstring2(String s) {
        //哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<>();

        int n = s.length();
        int rk =-1,ans =0;
        for (int i = 0; i < n; i++) {
            if (i!=0){
                //做指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i-1));
            }

            while (rk+1<n&&!occ.contains(s.charAt(rk+1))){
                //不断移动右指针
                occ.add(s.charAt(rk+1));
                ++rk;
            }
            //第i到rk 字符是一个极长的无重复字符子串
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "asawervccaawsaresafraa";

        int res = lengthOfLongestSubstring(s);
        System.out.println(res);

    }
}
