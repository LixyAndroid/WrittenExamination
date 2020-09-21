package April.test0428;

import java.util.ArrayList;

/**
 * @author Li Xuyang
 * @date 2020/4/29 14:14
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main1 {

    ArrayList<Integer> list = new ArrayList<>();

    //给定一棵二叉搜索树，请找出其中第k大的节点。
    //中序遍历是左根右，从小到大，所以第k大的索引就是list.size()-k
    public int kthLargest(TreeNode root, int k) {

        dfs(root);
        return list.get(list.size() - k);

    }

    //先遍历全部，左根右，中序遍历
    public void dfs(TreeNode root) {

        if (root.left != null) {
            dfs(root.left);
        }

        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.right != null) {
            dfs(root.right);
        }
    }


    //优化
    //1，遍历到第k大就应该停止了，把结果拿出来
    //2，用到了额外空间，能不用就不用
    private int res = 0, k = 0;

    public int kthLargest2(TreeNode root, int k) {
        this.k = k;
        dfs2(root);
        return res;
    }

    //注意是第K大，所以顺序右根左；第K小是左根右，所以遍历为右根左，并且k次
    public void dfs2(TreeNode root) {

        if (root == null) {
            return;
        }
        dfs2(root.right);

        if (k == 0) {
            return;
        }
        if (--k == 0) {
            res = root.val;
        }


        dfs2(root.left);
    }


}
