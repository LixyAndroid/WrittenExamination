package September.test0916;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();

        s1 = s1.substring(1, s1.length() - 1);
        String[] strings1 = s1.split(",");
        int[] ints = new int[strings1.length];
        for (int i = 0; i < ints.length; i++) {
            if (!strings1[i].equals("")) {
                ints[i] = Integer.parseInt(strings1[i]);
            }
        }
        int num = in.nextInt();
        int N = in.nextInt();
        int M = in.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < ints.length; i++) {
            linkedList.add(ints[i]);
        }
        if (N + 1 < linkedList.size()) {
            linkedList.add(N + 1, num);
        } else {
            linkedList.addLast(num);
        }
        if (M < linkedList.size()) {
            linkedList.remove(M);
        } else {
            linkedList.removeLast();
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (i == linkedList.size() - 1) {
                System.out.print(linkedList.get(i));
            } else {
                System.out.print(linkedList.get(i) + " ");

            }


        }


    }
}
