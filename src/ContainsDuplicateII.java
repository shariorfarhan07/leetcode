import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    /*This problem is easily solvable using two loops O(n^2)
    * I want to solve it in O(n)
    * */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(nums[i],10000)+i<=k){
                return true;
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
