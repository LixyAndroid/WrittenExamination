package September.test0916;

import java.util.*;

/**
 * @author Li Xuyang
 * @date 2020/9/16 21:27
 */
public class Mian5 {
    static Stack<Integer> stackTotal = new Stack<>();
    static Stack<Integer> stackLittle = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String[]> list = new ArrayList<>();
        String[] temp = new String[n];
        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextLine();
        }

        for (int i = 0; i < temp.length; i++) {
            String[] strings1 = temp[i].split(" ");
            list.add(strings1);
        }


        for (int i = 0; i < list.size(); i++) {
            String[] strings1 = list.get(i);
            if (strings1.length == 2) {
                push(Integer.parseInt(strings1[1]));
            } else if (strings1.length == 1) {
                if (strings1[0].equals("getMin")) {
                    System.out.println(getMin());
                } else if (strings1[0].equals("top")) {
                    System.out.println(top());
                } else if (strings1[0].equals("pop")) {
                    pop();
                }

            }
        }

    }


    public static void push(int node) {
        stackTotal.push(node);
        if (stackLittle.empty()) {
            stackLittle.push(node);
        } else {
            if (node <= stackLittle.peek()) {
                stackLittle.push(node);
            } else {
                stackLittle.push(stackLittle.peek());
            }
        }

    }

    public static void pop() {
        stackTotal.pop();
        stackLittle.pop();
    }

    public static int top() {
        return stackTotal.peek();
    }

    public static int getMin() {
        return stackLittle.peek();
    }
}
