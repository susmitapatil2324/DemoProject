class Solution {

    public int maxProfit(int[] prices) {
        int totLProfit =0;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
               int profit = prices[i]- prices[i-1];
               totLProfit += profit;
            }
        }
        return totLProfit;
    }
}