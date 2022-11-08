public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) return false;
        if (targetSum-root.val==0 && root.right==null&&root.left==null) return true;
        return hasPathSum(root.right,targetSum-root.val)||hasPathSum(root.left,targetSum-root.val) ;
    }
}
