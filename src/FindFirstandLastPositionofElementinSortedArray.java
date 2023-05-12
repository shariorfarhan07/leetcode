import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(searchRange(new  int[]{5,7,7,8,8,10},8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==1&&nums[0]==target) return new int[]{0,0};
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


        int f=st;
        if (f<0||f>=nums.length) return new int[]{-1,-1};
        while (nums[f]==target){
            start=f;
            f--;
            if (f<0||f>=nums.length) break;
        }
        f=st;
        while (nums[f]==target){
            end=f;
            f++;
            if (f<0||f>=nums.length) break;
        }
        return new int[]{start,end};
    }
}
