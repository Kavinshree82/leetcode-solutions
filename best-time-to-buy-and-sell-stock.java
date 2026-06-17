class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprof=0;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }

            int profit=prices[i]-minprice;

            if(profit>maxprof)
            {
                maxprof=profit;
            }
        }
        return maxprof;

    }
}