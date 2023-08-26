class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 1;
        int profit = 0;
        while(sellDay<prices.length){
            if(prices[buyDay]<prices[sellDay]){
                profit = Math.max(profit,(prices[sellDay]-prices[buyDay]));
            }else{
                buyDay = sellDay;
            }
            sellDay++;
        }

        return profit;
    }
}