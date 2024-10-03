import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesfromSortedArray().removeDuplicates2(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 6,6, 7,}));
    }

    /*sliding window algo 0(n) time
    * solve it in a more efficient way with 2 pointer
    * */
    public int removeDuplicates2(int[] nums) {
        int r=1,l=1,ret;
        while (r< nums.length && l< nums.length){
            if (nums[r-1]!=nums[r])nums[l++]=nums[r];
            r++;
        }
        ret=l;
        while ( l< nums.length){
            nums[l++]=0;
        }


//        System.out.println(Arrays.toString(nums));
        return ret;
    }

    // time complexity =o(n^2)
    public int removeDuplicates(int[] nums) {
        int count=0,j=1,k=0,c=1;
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            j=i+1;
            if (nums[i] ==nums[j]) {


                while (i < nums.length && j < nums.length&& nums[i] == nums[j]) {

                    j++;
                    if ( nums[i] == nums[j] ){
                        c++;

                    }

//                    System.out.println(i+" "+j+" "+c+"far");
                }

                k=i+1;
                while (k < nums.length && j < nums.length ){
                    if(nums.length-c>j)
                        nums[k++]=nums[j++];
                    else {
                        nums[k++]=nums[j];
                        nums[j++] = 0;
//                        System.out.println(Arrays.toString(nums));

                    }
                }
//                System.out.println(i+" "+j+" "+count);

            }
           System.out.println(Arrays.toString(nums));
           System.out.println(i+" "+j+" "+count+" "+c);

        }
        return  count;
    }
}
