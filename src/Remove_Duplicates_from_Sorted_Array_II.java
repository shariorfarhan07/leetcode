import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] a=new int[]{1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5,5, 6};
//        System.out.println(removeDuplicates(a));
//        a=new int[]{1,1,1,2,2,3};
//        System.out.println(removeDuplicates(a));
//        a=new int[]{0,0,1,1,1,1,2,3,3};
//        System.out.println(removeDuplicates(a));
        a=new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(a));

    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length<3) return 3;
        int count=0,l=2,r=2;
        while (l<nums.length && r<nums.length) {
            if (nums[r-2]==nums[r]){
                r++;
            }else {
                nums[l++]=nums[r++];
            }

            System.out.println(Arrays.toString(nums));
        }
        while (l<nums.length)nums[l++]=0;
        return l;
    }
}
