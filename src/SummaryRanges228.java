import java.util.LinkedList;
import java.util.List;

public class SummaryRanges228 {
    public static void main(String[] args) {
        System.out.println(new SummaryRanges228().summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
    public List<String> summaryRanges(int[] nums) {
        int l=0,r=0;
        List<String> limit=new LinkedList<>();
        if (nums.length==0) return limit;
        while (r<nums.length-1){
            if (nums[r]!=nums[r+1]-1){
                if (l==r)limit.add(""+nums[l]);
                else limit.add(nums[l]+"->"+nums[r]);
                l=r+1;
            }
            r++;
//            System.out.println(r+" "+l);
        }
        if (l==r)limit.add(""+nums[l]);
        else limit.add(nums[l]+"->"+nums[r]);

        return limit;
    }
}
