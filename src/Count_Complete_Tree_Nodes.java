public class Count_Complete_Tree_Nodes {

    public int countNodes(TreeNode root) {
        if (root==null) return 0;
    return 1+countNodes(root.right)+ countNodes(root.left);
    }
}
