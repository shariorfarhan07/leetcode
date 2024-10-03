import java.util.Arrays;

public class ClimbingStairs_with_memoization {
     static int m[];//memoization

    public static void main(String[] args) {

        System.out.println(climbStairs(2));
        System.out.println(Arrays.toString(m));





    }

    public static int climbStairs(int n) {
        System.out.println(n);
    if (m==null){
        m=new int[n+1];
        for (int i = 0; i < m.length; i++) {
            m[i]=-1;
        }
    }


    if (n<0) return 0;
    if (n==0) return 1;
    if (m[n]!=-1) return m[n];
     m[n]= climbStairs(n-1)+climbStairs(n-2);
     return m[n];
    }

}



//class Solution {
//    public int climbStairs(int n) {
//        if(n<2){
//            return n;
//        }
//
//        int[] ans = new int[n];
//        ans[0] = 1;
//        ans[1] = 2;
//
//        for(int i=2;i<n;i++) {
//            ans[i]=ans[i-1]+ans[i-2];
//        }
//        return ans[n-1];
//
//    }
//}