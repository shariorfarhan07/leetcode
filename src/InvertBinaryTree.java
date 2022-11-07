

 public class TreeNode {
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

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        if(root.left!=null && root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        } else if (root.left!=null && root.right==null   ) {
            root.right=null;

            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }else if (root.left==null && root.right!=null   ) {
            root.left=null;

            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }

        if (root.left!=null) invertTree(root.left);
        if (root.right!=null) invertTree(root.right);
        return root;
    }
}
