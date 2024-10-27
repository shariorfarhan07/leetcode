import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
//        int a[] ={0,0,0,0};
        int a[] ={34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i!=0 && nums[i]==nums[i-1]) continue;
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
