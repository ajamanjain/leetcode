class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int max=0;
        int profit=0;
        int val=prices[0];
        int len=prices.length;
        
        for(int i=1; i<len; i++)
        {
          if(prices[i]>val)
                {
                    profit=prices[i]-val;
                    if(profit>max)
                    {
                        max=profit;
                    }
                }
            else
            {
                val=prices[i];
            }
        }
        
        return max;
    }
}
