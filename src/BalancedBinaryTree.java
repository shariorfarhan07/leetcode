import java.util.Arrays;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int temp[]=new int[]{1,0};
        return  temp[0] == 1;
    }

    public int[] isBalance(TreeNode root,int temp []){
        int left[]={1,0},right[]={1,0};
        if (root==null)
            return temp;
        if (root.left!=null)
            left=isBalance(root.left,temp);
        if (root.right!=null)
            right=isBalance(root.right,temp);
        System.out.println(Arrays.toString(left)+Arrays.toString(right)+Arrays.toString(temp));

        if (left[0]==1&&right[0]==1&& Math.abs(left[1]-right[1])<=1){
            temp[1]=temp[1]+Math.max(left[1],right[1])+1;
        }else{
            temp[1]=temp[1]+Math.max(left[1],right[1])+1;
            if (temp[0]!=0)temp[0]=0;
        }
        if (temp[0]==1&&right[0]==1&& temp[1]<right[1]) return left;

        return right;
    }
}
