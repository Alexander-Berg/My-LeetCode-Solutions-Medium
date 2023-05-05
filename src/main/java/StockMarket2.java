public class StockMarket2 {
    public static class Solution {
        public int maxProfit(int[] prices) {
            int sell=prices[0],bou=prices[0];
            int pro=0;
            int n=prices.length;
            for(int i=0;i<n;i++){
                if(prices[i]>sell){
                    sell=prices[i];
                    if(i==n-1) pro+=sell-bou;
                }
                else if(prices[i]<sell || i==n-1){
                    pro+=sell-bou;
                    bou=prices[i];
                    sell=prices[i];
                }
            }
            return pro;
        }
    }

}
