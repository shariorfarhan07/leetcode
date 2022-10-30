import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count=0,j=1,k=0,c=0;
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            j=i+1;
            if (nums[i] ==nums[j]) {
                count++;
                while (i < nums.length && j < nums.length && nums[i] == nums[j]) {
                    c++;
                    j++;
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
//            System.out.println(Arrays.toString(nums));
//            System.out.println(i+" "+j+" "+count);

        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesfromSortedArray().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 6,6, 7,}));
    }
}
