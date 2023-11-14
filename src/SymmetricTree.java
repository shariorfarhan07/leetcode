/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class SymmetricTree {
    private boolean SymmetricTreeChecker(TreeNode tree1, TreeNode tree2) {
        if (tree1==null && tree2 == null) return true;
        if (tree1==null || tree2 == null) return false;
        System.out.println(tree1.val+" "+ tree2.val);
        if (tree1.val!=tree2.val) return false;
        return  SymmetricTreeChecker(tree1.left,tree2.right) && SymmetricTreeChecker(tree2.left,tree1.right);

    }

    public boolean isSymmetric(TreeNode root) {
        return SymmetricTreeChecker(root.left,root.right);
    }

}
