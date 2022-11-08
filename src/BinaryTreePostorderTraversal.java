import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    List<Integer> nodes;
    {nodes=new ArrayList<>();}
    public List<Integer> postorderTraversal(treeNode root) {
        if (root==null) return nodes;
        nodes.add(root.val);
        if (root.left!=null)postorderTraversal(root.left);
        if (root.right!=null)postorderTraversal(root.right);
        return nodes;
    }
}
