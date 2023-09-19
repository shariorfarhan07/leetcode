import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindtheDuplicateNumber {
    public static void main(String[] args){

    }
//     without constant extra space
    public static int findDuplicate(int[] nums) {
        Set<Integer> map =new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) return nums[i];
            map.add(nums[i]);
        }
        return -1;
    }


//    with constant extra space

}

