import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    public static void main(String[] args){

    }


    public static boolean isValidBST(TreeNode root) {
        List<Integer>inorder = new ArrayList<>();
        getInorder(root,  inorder);
        System.out.println(inorder.toString());
        for(int i = 1; i < inorder.size(); i++) {
            if (inorder.get(i)>inorder.get(i-1)) return false;
        }

        return true;
    }

    public static void getInorder(TreeNode root, List<Integer> inorder) {
        if (root== null) return;
        getInorder(root.right,inorder);
        inorder.add(root.val);
        getInorder(root.left,inorder);
    }



}
