class Solution {

    public int maxProfit(int[] prices) {
        int miniSoFar = prices[0];
        int maxProfit =0;

        for(int i=0;i<prices.length;i++)
        {
           miniSoFar= Math.min(miniSoFar,prices[i]);
           int profit = prices[i] - miniSoFar;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}