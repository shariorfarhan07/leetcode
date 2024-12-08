import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args){
        int[] a= new int[]{0,1,0,3,12};
//        a= new int[]{0,0,1};
        System.out.println(Arrays.toString(a));
        moveZeroes(a);
        System.out.println(Arrays.toString(a));

    }
    public static void moveZeroes(int[] nums) {
        int left =0;
        for(int right = 0; right < nums.length; right++) {
            if (nums[right]!=0){
                int temp = nums[right];
                nums[right]= nums[left];
                nums[left] =temp;
                left++;
                System.out.println(Arrays.toString(nums));
            }
        }
    }

    public static void moveZeroes11(int[] nums) {
        int left=0,right=0;

        while (right<nums.length  ){
           if (nums[right]==0) right++;
           else nums[left++]=nums[right++];
        }
        while (left<nums.length) nums[left++]=0;
        
    }

    public static void moveZeroes1(int[] nums) {
    int slow=0,fast=0;
    while (fast<nums.length){
        while (nums[fast]==0) fast++;
        if (fast>=nums.length) break;
        nums[slow++]=nums[fast++];
    }
    while (slow<nums.length) nums[slow++]=0;
    }
}
