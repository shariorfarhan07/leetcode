import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args){
        int[] a=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(a));
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0,prev=0,max=nums[0];
        int l=0,r=1;
        sum=nums[l];
        while (l<r&&r<nums.length){
            if (sum<0) sum=0;
            sum+=nums[r++];
            if (max<sum) max=sum;
        }
    return max;}
}
