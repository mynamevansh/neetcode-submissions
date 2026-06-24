class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int[] buy=new int[prices.length];
        buy[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            buy[i]=Math.min(prices[i],buy[i-1]);
            profit=Math.max(profit,prices[i]-buy[i]);
        }
        return profit;
    }
}
