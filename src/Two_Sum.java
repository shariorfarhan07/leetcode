import java.util.Arrays;
import java.util.HashMap;

class Tow_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> need=new HashMap<>();
        int i=0;
        boolean check=false;
        while (!check){
            check=need.containsKey(nums[i]);
            if ( check ){
                return new int[]{need.get(nums[i]), i};
            }else {
                need.put(target-nums[i],i);
            }
            i++;
            if (i== nums.length)break;
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        Tow_Sum t= new Tow_Sum();
        System.out.println(Arrays.toString(t.twoSum(new int[]{3,2,4},6)));
    }
}