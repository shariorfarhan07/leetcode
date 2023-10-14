import java.util.*;

public class Binary_Tree_Paths {
    public static void main(String[] args){
        TreeNode t3=new TreeNode(3);
        TreeNode t2=new TreeNode(2,t3,null);
        TreeNode t4=new TreeNode(5);
        TreeNode t1=new TreeNode(1,t2,t4);

        System.out.println(Arrays.toString(binaryTreePaths(t1).toArray()));


    }



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




    static List<String> lp=new LinkedList<>();
    public static List<String> binaryTreePaths(TreeNode root) {
    pathoftree(root,"");
    return lp;
    }
    public  static void pathoftree(TreeNode node,String s){
        if (s.length()==0) s+=node.val;
        else s+="->"+node.val;
        if (null==node){}
        else if (node.left==null&&node.right!=null){
            pathoftree(node.right,s);
        }
        else if (node.left!=null&&node.right==null){
            pathoftree(node.left,s);
        }
        else if (node.left==null&&node.right==null&& s.length()!=0){
            lp.add(s);
        }
        else {
            pathoftree(node.left,s);
            pathoftree(node.right,s);
        }

    }



}
