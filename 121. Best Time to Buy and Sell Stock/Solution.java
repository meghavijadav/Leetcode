class Solution {
    public int maxProfit(int[] prices) {
        /*
         * Approach
         * -The concept is that you need to buy the stock when the price is least and
         * sell the stock when the prices are high. So that you can make maximum profit
         * //- if we take the array [7,1,5,3,6,4]
         * then the auxillary array will be [7,6,6,6,6,4]
         * now we will check like 7-7 = 0; 6-1 = 5; 6-5= 1; 6-3 = 3;6-6= 0; 4-4 = 0
         * - so like this 5 is the answer.
         * - you need to buy on day 2 and sell on day 5
         * 
         * but there is a better approach to this
         * what we will do is we will store the minimum so far and try to sell stock
         * every day
         * [7,1,5,3,6,4]
         * 7 minsofar=7 profit=0 max profit = 0
         * 1 minsofar=1 profit=0 max profit = 0
         * 5 minsofar=1 profit=4 max profit = 4
         * 3 minsofar=1 profit=2 max profit = 4
         * 6 minsofar=1 profit=5 max profit = 5
         * 4 minsofar=1 profit=3 max profit = 5
         */
        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            } else if (prices[i] - min_val > max_profit) {
                max_profit = prices[i] - min_val;
            }
        }
        return max_profit;
    }
}
