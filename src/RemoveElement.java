import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{1,2,3,3,3,4,5,3,6,8},3));
    }
    /*implementation of 2 pointers
    * solved in O(n) time complexity
    * & O(1) space complexity*/
    public int removeElement(int[] nums, int val) {
       int l=0,r=0;
       while (r<nums.length){
          if(nums[r]==val){
              r++;
          }else{
              nums[l]=nums[r];
              r++;
              l++;

          }
//           System.out.println(r+" "+l);


       }
        val=l;
        while (l<nums.length){nums[l++]=0;}
       return val;
    }
}
