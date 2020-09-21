package September.test0916;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/9/16 16:34
 */

class Node {
    int val;
    Node left;
    Node right;

    Node(int x) {
        val = x;
    }
}

public class BiTree {
    public static int index = 0;

    public static void main(String[] args) {
//        int pre[] = {1, 2, 4, 8, 5, 3, 6, 7};//先序排列
//        int in[] = {8, 4, 2, 5, 1, 6, 3, 7};//中序排列

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        int[] perInts = new int[strings.length];
        for (int i = 0; i < perInts.length; i++) {
            perInts[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(perInts));

        int[] midInts = perInts;
        Arrays.sort(midInts);
        System.out.println(Arrays.toString(midInts));
        Node root = build(0, perInts.length - 1, perInts, midInts);
        perOrder(root);
    }

    public static Node build(int left, int right, int preorder[], int inorder[]) {
        Node root = null;
        if (left <= right) {
            int in = left;
            for (int i = in; i <= right; i++) {
                if (inorder[i] == preorder[index]) {
                    in = i;
                    break;
                }

            }
            root = new Node(preorder[index]);
            index++;
            root.left = build(left, in - 1, preorder, inorder);
            root.right = build(in + 1, right, preorder, inorder);

        }
        return root;
    }

    public static void perOrder(Node root) {
        if (root != null) {
            System.out.print(root.val+" ");
            perOrder(root.left);
            perOrder(root.right);
        }
    }
}
