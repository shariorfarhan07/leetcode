import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int sum=nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
        }
        return sum;
    }
    public int singleNumber12(int[] nums) {
        Map<Integer,Integer> valueChecker=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null==valueChecker.get(nums[i])) {
                valueChecker.put(nums[i],1);
            }else{
                valueChecker.put(nums[i],valueChecker.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer, Integer> item: valueChecker.entrySet()) {
                if (item.getValue()==1) return item.getKey();
        }
        return -1;
    }
}
