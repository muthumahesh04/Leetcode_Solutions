class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int max_profit=0;
        int minimum_price_to_buy=prices[0];

        for(int i=0 ; i<prices.length ; i++)
        {
            if(prices[i]<minimum_price_to_buy)
               minimum_price_to_buy=prices[i];
            if(prices[i]-minimum_price_to_buy > max_profit)
               max_profit=prices[i]-minimum_price_to_buy;
        }
        return max_profit;
    }
}