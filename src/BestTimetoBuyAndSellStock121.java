import java.util.Arrays;

public class BestTimetoBuyAndSellStock121 {
    public static void main(String[] args) {
        System.out.println(new BestTimetoBuyAndSellStock121().maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        int i=0,p=0,max=0;
        while (p<prices.length) {
            if (prices[p]-prices[i]>max)max=prices[p]-prices[i];
            if (prices[p]<prices[i])i=p;
            p++;
        }
        return max;
    }
}
