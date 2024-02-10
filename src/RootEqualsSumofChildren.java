public class RootEqualsSumofChildren {


      static class TreeNode {
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




    public boolean checkTree(TreeNode root) {
    if (root==null) return true;
    int right=(root.right==null)?0:root.right.val;
    int left=(root.left==null)?0:root.left.val;
    if (root.val==left+right) return true;
    return false;
    }
}
