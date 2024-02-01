import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(new int[]{100,4,200,1,3,2}));

}
    HashSet<Integer>  uniqueNumbers;
    HashMap<Integer,ArrayList<Integer>> adjlist;
    public int longestConsecutive(int[] nums) {
        adjlist=new HashMap<>();
        uniqueNumbers=new HashSet<>();
        for (int Number : nums) uniqueNumbers.add(Number);

        for (int num: nums){
            if (isHead(num)){
                ArrayList<Integer> temp =new ArrayList();
                temp.add(num);
                adjlist.put(num,temp);
            }else{
                int head=detectHead(num);
                adjlist.get(head).add(num);
            }
        }

        int max =0;
        for(Map.Entry<Integer, ArrayList<Integer>> e :adjlist.entrySet()){
            max= (int) Math.max(max,e.getValue().stream().count());
        }


        return max;
    }
    public int detectHead(int a){
        int head=a-1;
        while (uniqueNumbers.contains(head)){
            head=head-1;
        }

        return head+1;
    }

    public boolean isHead(int a){
        return !uniqueNumbers.contains(a-1);
    }







}
