public class FindPeakElement {
    public static void main(String[] args){
    System.out.println(findPeakElement(new int[]{1,2,3,1}));
    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        if (end==0) return 0;
        if (nums[end]>nums[end-1]) return end;
        if (nums[start]>nums[start+1]) return start;
        int mid=0;
        // start++;
        // end--;
        while (start<end){
            mid=(start+end)/2;
            if (nums[mid-1]< nums[mid] && nums[mid+1]< nums[mid])return mid;
            else if(nums[mid-1] > nums[mid]){
                end = mid - 1;
            }else if (nums[mid+1]> nums[mid]){
                start = mid + 1;

            }else start = mid + 1;
        }
        return end;
    }


}
