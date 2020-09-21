package April.test0425;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Li Xuyang
 * @date 2020/4/25 14:49
 */
public class Main2OtherAnswer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }

        in.close();

        int[] res = new  int[n];


        //stack中要保存的是，能看见楼的index
        int[] rightLook = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >=0; i--) {

            rightLook[i] = stack.size();
            //看不到的，就pop
            while ((!stack.isEmpty()&&arr[i]>=arr[stack.peek()])){
                stack.pop();
            }
            stack.push(i);

        }

        stack.clear();

        for (int i = 0; i < n; i++) {

            int total = rightLook[i]+1+stack.size();

            //看不到
            while ((!stack.isEmpty())&&arr[i]>=arr[stack.peek()]){
                stack.pop();
            }

            res[i] = total;
            stack.push(i);

        }

        for (int i = 0; i < n; i++) {
            if (i==n-1){
                System.out.print(res[i]);
            }else {
                System.out.print(res[i]+" ");
            }

        }




    }
}
