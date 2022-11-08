



public class InvertBinaryTree {
    public treeNode invertTree(treeNode root) {
        if (root==null) return null;
        if(root.left!=null && root.right!=null){
            treeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        } else if (root.left!=null && root.right==null   ) {
            root.right=null;

            treeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }else if (root.left==null && root.right!=null   ) {
            root.left=null;

            treeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }

        if (root.left!=null) invertTree(root.left);
        if (root.right!=null) invertTree(root.right);
        return root;
    }
}
