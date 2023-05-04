public class FindFirstandLastPositionofElementinSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==1&&nums[0]==target){
            return new int[]{0,0};
        }
        int start=0;
        int end= nums.length-1;
        int mid;
        int st=-1;
        while (start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target) {
                st=mid;
                break;
            }
            if (target>nums[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        start=st;
        end=st;
        while (st>=0 && st<nums.length && nums[st]==target){
            start=st;
            st--;
        }

        while (st>=0 && st<nums.length && nums[st]==target){
            end=st;
            st++;
        }

        return new int[]{start,end};
    }
}
