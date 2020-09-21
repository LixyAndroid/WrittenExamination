package September.test0916;

import java.util.*;

/**
 * @author Li Xuyang
 * @date 2020/9/16 15:27
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        int[] perInts = new int[strings.length];
        for (int i = 0; i < perInts.length; i++) {
            perInts[i] = Integer.parseInt(strings[i]);
        }
        int[] midInts = perInts;
        Arrays.sort(midInts);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < perInts.length; i++) {
            list.add(perInts[i]);
        }

        TreeNode root = initTreeNode(perInts, 0, perInts.length - 1, midInts, 0, midInts.length - 1);
        //TreeNode root = creatTree(midInts,0,midInts.length-1,list);

        findLeaf(root);
        perOrder(root);
    }

    public static void perOrder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.val);
            perOrder(treeNode.left);
            perOrder(treeNode.right);
        }
    }

    public static void findLeaf(TreeNode root) {
        if (root==null){
            return;
        }else if ((root.left == null) && (root.right == null)) {
            System.out.print(root.val + " ");
        } else {
            if (root.left != null) {
                findLeaf(root.left);
            }
            if (root.right != null) {
                findLeaf(root.right);
            }
        }


    }

    public static TreeNode initTreeNode(int[] perOrder, int pstart, int pend, int[] inorder, int instart, int inend) {
        if (pstart > pend || instart > inend) {
            return null;
        }
        int rootData = perOrder[pstart];
        TreeNode root = new TreeNode(rootData);
        int rootIndex = findIndexInArr(inorder, rootData, instart, inend);
        int offset = rootIndex - instart - 1;
        TreeNode left = initTreeNode(perOrder, pstart + 1, pstart + offset + 1, inorder, instart, instart + offset);
        TreeNode right = initTreeNode(perOrder, pstart + offset + 2, pend, inorder, rootIndex + 1, inend);
        root.left = left;
        root.right = right;
        return root;
    }


    public static TreeNode creatTree(int[] inorder, int instart, int inend, LinkedList<Integer> list) {
        int item = list.removeFirst();
        TreeNode node = new TreeNode(item);
        int index = findIndexInArr(inorder, item, instart, inend);
        if (instart == index) {
            node.left = null;
        } else {
            node.left = creatTree(inorder, instart, index - 1, list);
        }

        if (index == inend) {
            node.right = null;
        } else {
            node.right = creatTree(inorder, index+1, inend, list);
        }

        return node;
    }

    private static int findIndexInArr(int[] inorder, int rootData, int instart, int inend) {

        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootData) {
                return i;
            }
        }
        return -1;
    }
}




