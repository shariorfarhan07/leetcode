import java.util.Arrays;

public class SortColors {
    public static void main(String[] args){
        int[] a =new int[]{0,1,2,0,1,2,0,1,2};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sortColors(int[] nums) {
        int i =0,left=0,right=nums.length-1;

        while (i <= right){
            if (nums[i]==0){
                swap(nums,left,i);
                left++;
                i++;
            }else if (nums[i]==2){
                swap(nums,right,i);
                right--;
            }else {
                i++;
            }
        }
    }


    public static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
