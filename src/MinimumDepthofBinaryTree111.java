public class MinimumDepthofBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        int a=minDepth(root.left);
        int b=minDepth(root.right);
        if(a==0) return b+1;
        if(b==0) return a+1;
        return ((a<b)?a:b)+1;
    }
}
