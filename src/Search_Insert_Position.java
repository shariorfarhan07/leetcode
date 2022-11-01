public class Search_Insert_Position {
    public static void main(String[] args) {
        System.out.println(new Search_Insert_Position().searchInsert(new int[]{1,3,5,6},5));
    }
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1,ind=-1,mid;

        while (start>end){
            mid=(start+end)/2;
            if (nums[mid]==target){ind=mid;break;}
            if (nums[mid]<target){end=mid-1;}
            else{start=mid+1;}
        }
        return target;
    }
}
