package May.test0511;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        fun();
    }

    private static void fun() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] num = new int[N];
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            num[i] = in.nextInt();
            if (num[i] == 4) {
                strings[i] = "";
            } else {
                strings[i] = in.next();
            }


        }

        in.close();


        StringBuilder stringBuilder = new StringBuilder();
        String s = "";
        int index = 0;
        while (index < N) {
            if (num[index] == 1) {
                stringBuilder.append(strings[index]);
            }
            if (num[index] == 2) {
                s = stringBuilder.substring(stringBuilder.length()-Integer.parseInt(strings[index]),stringBuilder.length());

                stringBuilder.delete(stringBuilder.length()-Integer.parseInt(strings[index]),stringBuilder.length());
            }
            if (num[index] == 3) {
                System.out.println(stringBuilder.charAt(Integer.parseInt(strings[index])-1));
            }
            if (num[index] == 4) {
                int temp = index;
                while (temp >= 0) {
                    if (num[temp] == 1) {
                        stringBuilder.delete(stringBuilder.length()-strings[temp].length(),stringBuilder.length());

                        num[temp] = 0;
                        break;
                    } else if (num[temp] == 2) {
                        //找回删除的
                        stringBuilder.append(s);

                        num[temp]=0;
                        break;
                    }

                    temp--;
                }
            }
            index++;

        }


    }


}
