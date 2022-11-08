import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    List<Integer> nodes;
    {nodes=new ArrayList<>();}
    public List<Integer> inorderTraversal(treeNode root) {
        if (root==null) return nodes;
        if (root.left!=null)inorderTraversal(root.left);
        nodes.add(root.val);
        if (root.right!=null)inorderTraversal(root.right);
        return nodes;
    }
}
