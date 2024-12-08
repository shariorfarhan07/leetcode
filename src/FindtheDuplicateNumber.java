import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindtheDuplicateNumber {
    public static void main(String[] args){
       System.out.println( test4());
       test3();
    }

    public static int test4() {
        try {
            System.out.println("Try block");
//            return 1;
            throw new RuntimeException("Exception in try");
        } catch (Exception e) {
            System.out.println("Catch block");
            throw new IllegalArgumentException("Exception in catch");
//            return 2;
        } finally {
            System.out.println("Finally block");
//            throw  new RuntimeException("Exception in Finally block");
            return 3;
        }
//        return 0;
    }
    public static void test3() {
        try {
            System.out.println("Try block");
            throw new RuntimeException("Exception in try");
        } catch (Exception e) {
            System.out.println("Catch block");
            throw new IllegalArgumentException("Exception in catch");
        } finally {
            System.out.println("Finally block");
            throw  new RuntimeException("Exception in Finally block");
        }
    }

    public static int test2() {
        int x = 1;
        try {
            x++;
            return x; // Line A
        } catch (Exception e) {
            x++;
            return x; // Line B
        } finally {
            x++;
        }
    }



    public static int test() {
        try{
            return 1;
        }catch (Exception e ){
            return 2;
        }finally{
            System.out.println("test");
        }
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

