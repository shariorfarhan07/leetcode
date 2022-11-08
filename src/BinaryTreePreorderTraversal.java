import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    List<Integer> nodes;
    {nodes=new ArrayList<>();}
    public List<Integer> preorderTraversal(treeNode root) {
        if (root==null) return nodes;
        nodes.add(root.val);
        if (root.left!=null)preorderTraversal(root.left);
        if (root.right!=null)preorderTraversal(root.right);
        return nodes;
    }
}
