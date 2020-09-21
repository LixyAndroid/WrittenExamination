package August.test0808;

import java.util.*;

/**
 * @author Li Xuyang
 * @date 2020/8/8 15:15
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < n - 1; i++) {
            int[] temp = new int[3];
            for (int j = 0; j < 3; j++) {
                temp[j] = in.nextInt();
            }
            if (i == 0) {
                deque.addLast(temp);
                continue;
            }

            if (temp[2] < deque.getLast()[2]) {
                int[] temp2 = deque.getLast();
                deque.removeLast();
                deque.addLast(temp);
                deque.addLast(temp2);
            } else {
                deque.addLast(temp);
            }


        }

        List<int[]> list = new ArrayList<>(deque);


        //已经有序
        int lucheng = 0;
        int qishou = 0;
        for (int i = 0; i < list.size(); i++) {


            if (list.get(i)[0] != 1) {
                int ja = 0;
                int min = Integer.MAX_VALUE;

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j)[1] == list.get(i)[0]) {
                        min = Math.min(min, list.get(j)[2]);
                        ja = i;
                    }
                }
                lucheng +=min;
                qishou -= list.get(ja)[2];

            }

        }
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                lucheng += list.get(i)[2];
                qishou += list.get(i)[2] * 2;
            } else {
                qishou += list.get(i)[2];
            }


        }

        in.close();
        System.out.println(lucheng + " " + qishou);
    }
}
