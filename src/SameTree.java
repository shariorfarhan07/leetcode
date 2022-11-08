public class SameTree {
//     when you think too much for a simple problem.
    public boolean isSameTree(treeNode p, treeNode q) {
        if (q==null&&p==null) return true;
        if (q==null||p==null||(p.val!= q.val)||(p.right!=null &&q.right==null )||(q.right!=null &&p.right==null ))return false;
        boolean check=true;

        if (p.right!=null && q.right!=null ) check=check&&isSameTree(p.right,q.right);
        if (p.left!=null && q.left!=null ) check=check&&isSameTree(p.left,q.left);
        check=check&&(p.val!= q.val);
        return check;
    }
//     when you think smartly this type of solution comes in mind
public boolean isSameTree2(treeNode p, treeNode q) {
    if (q==null&&p==null) return true;
    if (q==null||p==null|| p.val!=q.val)return  false;
    return isSameTree( p.right,  q.right )&& isSameTree( p.left,  q.left );
}
}



  class treeNode {
      int val;
      treeNode left;
      treeNode right;
      treeNode() {}
      treeNode(int val) { this.val = val; }
      treeNode(int val, treeNode left, treeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
