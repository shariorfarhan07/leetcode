import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindtheDuplicateNumber {
    public static void main(String[] args){

    }
// if the number is 1 to N and only one repeating char
    public static int findDuplicate4(int[] nums) {
        Set<Integer> map =new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) return nums[i];
            map.add(nums[i]);
        }
        return -1;
    }

    //    with constant extra space
//     without constant extra space
    public static int findDuplicate(int[] nums) {
        int sum=0;
        int total=nums.length*(nums.length-1)/2;
        for (int i : nums){
            sum+=i;
        }
        return sum-total;
    }


}

