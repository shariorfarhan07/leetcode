public class Search_Insert_Position {
    public static void main(String[] args) {
        System.out.println(new Search_Insert_Position().searchInsert(new int[]{1,3},2));
    }
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length,ind=nums.length,mid = 0;
        if (target==0) return 0;
        while (start<end){
            mid=(start+end)/2;
            if (nums[mid]==target){return mid;}
            else if (nums[mid]>target){end=mid;}
            else{start=mid+1;}
        }

        return start;
    }
}
