public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        int a=maxDepth(root.left);
        int b=maxDepth(root.right);
        return ((a>b)?a:b)+1;
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }