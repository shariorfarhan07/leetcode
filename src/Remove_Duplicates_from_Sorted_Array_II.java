import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] a=new int[]{1, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 5, 6};
        System.out.println(Arrays.toString(a));
        removeDuplicates(a);
        a=new int[]{1,1,1,2,2,3};
        System.out.println(Arrays.toString(a));
        removeDuplicates(a);


        a=new int[]{0,0,0,1,1,1,2,2,3,3,3};
        System.out.println(Arrays.toString(a));
        removeDuplicates(a);

        a=new int[]{1,1,1,2,2,3};
        System.out.println(Arrays.toString(a));
        removeDuplicates(a);

        a=new int[]{1,2,3};
        System.out.println(Arrays.toString(a));
        removeDuplicates(a);

        a=new int[]{1,1,1};
        System.out.println(removeDuplicates(a));
        removeDuplicates(a);

    }

    private static void printArray(int[] a, int removeDuplicates) {
        System.out.println(Arrays.toString(a));
        System.out.print("{");
        for(int i = 0; i < removeDuplicates; i++) {
        System.out.print(a[i]+((removeDuplicates==i+1)?"}":","));
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums){
        int l=1,r=1;
        while (r<nums.length){
            while (r<nums.length && nums[l]==nums[r]) r++;
//            System.out.println(Arrays.toString(nums)+"r:"+r+" l:"+l);
            for(int i = 0; i <2&&r<nums.length ; i++) {
                nums[++l]=nums[r++];
            }

        }
        printArray(nums,l+1);
        return l+1;
    }
    //    this one works fails for {1,2,3}
    public static int removeDuplicates3(int[] nums) {
        int n = nums.length;
        if(n <= 2)
            return n;
        int rIndex = 1;
//        System.out.println(Arrays.toString(nums));
        for(int i = 1; i < n; i++)
        {

            if(nums[i] == nums[rIndex] && nums[i] == nums[rIndex - 1]) //&& nums[i] == nums[rIndex - 2])
                continue;
            nums[++rIndex] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return rIndex + 1;
    }
//    this one cant get the return index right !
 public static int removeDuplicates2(int[] nums) {
//     System.out.println(Arrays.toString(nums));
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
                }

//            System.out.println("= "+Arrays.toString(nums));
            }
//            count=l;
            System.out.println(count);
            while (l<nums.length)nums[l++]=0;
            while (nums[--l]==0) count++;
            System.out.println(Arrays.toString(nums)+count);
            return nums.length-count;
        }


}
