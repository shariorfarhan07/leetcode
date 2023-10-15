import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args){
        int[] a= new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(a));
        moveZeroes(a);
        System.out.println(Arrays.toString(a));

    }

    public static void moveZeroes(int[] nums) {
    int slow=0,fast=0;
    while (fast<nums.length){
        while (nums[fast]==0) fast++;
        if (fast>=nums.length) break;
        nums[slow++]=nums[fast++];
    }
    while (slow<nums.length) nums[slow++]=0;
    }
}
