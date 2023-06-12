import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args){
        int[] a=new int[]{4,3,2,7,8,2,3,1};
        List<Integer> l =findDisappearedNumbers(a);
        System.out.println(l);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int ap=Math.abs(nums[i])-1;
            nums[ap]=-1*(Math.abs(nums[ap]));
        }
        List<Integer> res=new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (nums[i]>0) res.add(i+1);
        }
    return res;
    }
}
