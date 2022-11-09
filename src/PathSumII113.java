import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {
    List<List<Integer>> nodelist;
    {nodelist=new ArrayList();

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        hasPathSum(root, targetSum);

        return nodelist;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) return false;
        if (targetSum-root.val==0 && root.right==null&&root.left==null) {
            nodelist.add(0,new ArrayList<Integer>());
            nodelist.get(0).add(root.val);
            return true;
        }
        Boolean b= hasPathSum(root.right,targetSum-root.val)||hasPathSum(root.left,targetSum-root.val) ;
        if (b) nodelist.get(0).add(root.val);
        return b;
    }
}
