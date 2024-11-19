import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BestTimetoBuyAndSellStock3 {
    public static void main(String[] args){
//        System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
//        System.out.println(maxProfit(new int[]{2,1,2,0,1}));
        System.out.println(maxProfit(new int[]{3,2,6,5,0,3}));
//        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
////        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
//        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
    public static int maxProfit2(int[] prices) {
        int buy=0,sell=0,max=0,oldMax=0,oldSell=0;
        while (sell<prices.length) {
            System.out.println(max+" "+oldMax);
            if (prices[sell]-prices[buy]>max){
                if (oldMax<max && oldSell<=buy ){
                    oldMax=max;
                    oldSell=buy;
                    System.out.println("Old max: "+oldMax+"\n oldSell:"+oldSell);
                }
                max=prices[sell]-prices[buy];
                System.out.println("New Max : "+max+"\nnew buy:"+buy);
            }
            if (prices[sell]<prices[buy])buy=sell;
            sell++;
        }
        if (oldSell<buy) max+=oldMax;
        return max;
    }


    public static int maxProfit(int[] prices) {
        int buy=0,sell=1,max=0;
        Stock maxStock=null,oldMaxStock=null;
        LinkedList<Stock> stocks=new LinkedList<>();
        while (sell<prices.length) {
            if (prices[sell]-prices[buy]>=max){
                System.out.println(prices[sell]-prices[buy]+" i:"+buy+" p:"+sell);
                max=prices[sell]-prices[buy];
                maxStock=new Stock(max,buy,sell);
                stocks.add(maxStock);
            }
            if (prices[sell]<prices[buy])buy=sell;
            sell++;
        }
        if (!stocks.isEmpty()){
            stocks=stocks.stream()
                    .sorted((a,b)->a.max-b.max)
                    .collect(Collectors.toCollection(LinkedList::new));
            int count =0;
            maxStock=stocks.getFirst();
            max=maxStock.max;
            stocks.removeFirst();
            while (count<2 && !stocks.isEmpty()){
                Stock st=stocks.getFirst();
                if (maxStock.buy()>=st.sell()){
                    max+=maxStock.max();
                }
                stocks.removeFirst();
            }
        }


        return max;
    }
    record Stock(int max,int buy,int sell){}

    }


