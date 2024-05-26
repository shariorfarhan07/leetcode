public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int max=0,count=0,left=0,right=0,flipZeros;

        while (right<nums.length){
            if (max<right-left) max = right - left;
//            if (nums[right]==0)
            right++;
        }

        return 0;
    }
}
