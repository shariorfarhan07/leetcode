public class CountGoodNodesinBinaryTree {
    public static void main(String[] args) {

    }




    public int goodNodes(TreeNode root) {
       return  goodNodes(root,root.val);
        }


    public int goodNodes(TreeNode root , int max) {
     if (root==null) return 0;
     if (root.val>=max) return 1+ goodNodes(root.left , root.val) + goodNodes(root.right , root.val);
     return goodNodes(root.left,root.val) + goodNodes(root.right , root.val);
    }





    }






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






}
