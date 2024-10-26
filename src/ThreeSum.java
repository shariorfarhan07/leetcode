import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
//        int a[] ={0,0,0,0};
        int a[] ={-1,0,1,2,-1,-4};

        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i!=0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int left=i+1,right=nums.length-1;
            while(left<right){
                if (nums[i]+nums[left]+nums[right]==0){
                    List<Integer> temp =new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    answer.add(temp);
                    left++;
                    while (nums[left]==nums[left-1] && left<right) left++;
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return answer;
    }
}
