import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] a=new int[]{1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5,5, 6};
        System.out.println(removeDuplicates(a));
        a=new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(a));
        a=new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(a));

    }
    public static int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int count=0,l=0,r=0,numbersElement=0;
        while (l<nums.length && r<nums.length-1){
            while (nums[r]==nums[r+1]){
             count++;
             r++;
            }
            while (l<((count<=2)? count:2)){
                l++;
            }





        }
        numbersElement=i++;
        while (i<nums.length) nums[i++]=0;
        System.out.println(Arrays.toString(nums));
        return numbersElement;
    }
}
