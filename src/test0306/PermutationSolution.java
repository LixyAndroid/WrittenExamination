package test0306;

/**
 * @author Li Xuyang
 * @date 2020/3/6 14:43
 * 1、输入一个字符串，输出该字符的所有组合。
 * 举个例子，如果输入abc，它的组合有a、b、c、ab、 bc、ac、 abc。
 */
public class PermutationSolution {

    public static int count = 0;

    public void printLetterCombine(String str) {
        int n = str.length();
        for (int i = 1; i <= n; i++) {
            char[] s = new char[i];
            getLetterCombine(s, 0, 0, i, str);
        }
    }

    public void getLetterCombine(char[] s, int index, int startI, int n, String str) {
        int length = str.length();
        for (int i = startI; i <= length - n + index; i++) {
            s[index] = str.charAt(i);

            if (index == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print(s[j]);
                }
                System.out.println();
                count++;
                continue;
            }
            getLetterCombine(s, index + 1, i + 1, n, str);
        }
    }

    public static void main(String[] args) {

        String str = "ab";
        PermutationSolution permutationSolution = new PermutationSolution();
        permutationSolution.printLetterCombine(str);
        System.out.println(count);
    }

}
