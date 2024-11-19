public class BestTimetoBuyandSellStockII {
    public static void main(String[] args){

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }
    public static int maxProfit(int[] prices) {
        int buy =0;
        int sell=0;
        int sum=0;
        while (sell<prices.length){
            if (prices[buy]<prices[sell]){
                sum+=prices[sell]-prices[buy];
            }
                buy=sell;
                sell++;
        }
        return sum;
    }
}
