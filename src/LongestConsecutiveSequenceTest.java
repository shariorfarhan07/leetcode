import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequenceTest {
    public static void main(String[] args){
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        for (int i :nums)set.add(i);
        for (int i : set){
            if (!set.contains(i-1)){
                int count =1;
                while (set.contains(i++)){
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }

    public static int longestConsecutive1(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int max=1,c=1;
        for (int i :nums)set.add(i);
        int temp =Integer.MIN_VALUE;
        for (int i : set){
          if (temp+1==i){
              temp++;
              c++;
              max=Math.max(max,c);
          }else{
              temp =i;
              c=1;
          }
        }
        return max;
    }
}


