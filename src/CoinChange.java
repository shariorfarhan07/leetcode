import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args){
        int[] a=new  int[]{2};

        System.out.println(coinChange(a,3));

    }

    public static int coinChange(int[] coins, int amount) {
        int backTrack[]=new int[amount+1];
        for(int i = 1; i < backTrack.length; i++) {
            backTrack[i]=amount+1;
        }
        for(int i = 1; i < backTrack.length; i++) {
            for (int coin : coins ) {
                if (i-coin>=0) backTrack[i]=Math.min(backTrack[i],backTrack[i-coin]+1);
            }
        }
//        System.out.println(Arrays.toString(backTrack));
        return (backTrack[amount]==amount+1)?-1:backTrack[amount];
    }

}
