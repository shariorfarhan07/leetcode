import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] a=new int[]{1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5,5, 6};
        System.out.println(removeDuplicates(a));
        a=new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(a));
        a=new int[]{0,0,0,1,1,1,2,3,3,3};
        System.out.println(removeDuplicates(a));
        a=new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(a));

    }
 public static int removeDuplicates(int[] nums) {
//        System.out.println(Arrays.toString(nums));
            if (nums.length<3) return 3;
            int count=0,l=2,r=2;
            while (l<nums.length&&r<nums.length) {
                if (nums[r-2]==nums[r] ){
                    r++;
                }else{
                    nums[l]=nums[r];
                    if (nums[r-1]==nums[r]) l++;
                    l++;
                    r++;
                    count++;
                }

//            System.out.println("= "+Arrays.toString(nums));
            }
            System.out.println(count);
            while (l<nums.length)nums[l++]=0;
            while (nums[--l]==0) count++;
            System.out.println(Arrays.toString(nums)+count);
            return nums.length-count;
        }


}
