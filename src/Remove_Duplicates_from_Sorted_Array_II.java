import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] a=new int[]{1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6};
        System.out.println(removeDuplicates(a));

    }
    public static int removeDuplicates(int[] nums) {
        int count=0,i=0,j=1,zeros=0;
        boolean isdouble=true;
        while (i<nums.length && j<nums.length){
        if (nums[i]==nums[j]){
            count++;

            if (count>=2 && isdouble){
                i++;
                isdouble=false;
            }
        }else {

            count=0;
            nums[i]=nums[j];
            isdouble=true;

            }
        j++;

        }



    return zeros;
    }
}
