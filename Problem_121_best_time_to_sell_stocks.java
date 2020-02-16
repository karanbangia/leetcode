//take two variables min price and maxProfit
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
           if(prices[i]<minPrice)
           {
               minPrice=prices[i];
           }
            else if(prices[i]-minPrice>maxProfit)
            {
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}