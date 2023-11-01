import java.util.Arrays;

public class Unique_Binary_Search_Trees {
    public static void main(String[] args){
     System.out.println(numTrees(3));
     System.out.println(numTrees(4));
     System.out.println(numTrees(5));
     System.out.println(numTrees(6));
    }

    public static int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i = 2; i < dp.length; i++) {
           int sum=0;
            for(int j = 0; j <i; j++) {
                sum+=dp[j]*dp[i-j-1];
//                System.out.println("dp["+j+"]"+dp[j]+"dp["+(i-j)+"]"+dp[i-j]);
            }
            dp[i]=sum;
        }
//        System.out.println(Arrays.toString(dp));
    return dp[n];
    }

}
