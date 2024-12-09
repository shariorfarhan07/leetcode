import java.util.Arrays;

public class SpecialArrayII {
    public static void main(String[] args){
        System.out.println(Arrays.toString(isArraySpecial(new int[]{1, 1}, new int[][]{{0, 1}, {0, 1}})));
    }
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
    int[] prefix = new int[nums.length];
    boolean[] outPut =new  boolean[queries.length];
    boolean even =nums[0]%2==0;
    for(int i = 1; i < nums.length; i++) {
        if (even){
             even =nums[i]%2==0;
             if (!even){
                 prefix[i]=prefix[i-1];
             }  else {
                 prefix[i]=prefix[i-1]+1;
             }
        } else {
            even =nums[i]%2==0;
            if (even){
                prefix[i]=prefix[i-1];
            }  else {
                prefix[i]=prefix[i-1]+1;
            }
        }

    }

    int i =0;
    for (int[] q : queries){
        outPut[i++]=prefix[q[0]]-prefix[q[1]]==0;
    }
        System.out.println(Arrays.toString(prefix));
        return outPut;
}
}
