class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int maxprofit=0;
        int len=prices.length;
        
        for(int i=1; i<len; i++)
        {
           if(prices[i]>prices[i-1])
           {
               maxprofit+=prices[i]-prices[i-1];
           }

        }
        
        return maxprofit;
    }
}
