class Solution {
    public int maxProfit(int[] prices) {
        // Step 1: Initialize totalProfit to 0
        int totalProfit = 0;

        // Step 2: Iterate through the prices array
        for (int i = 0; i < prices.length - 1; i++) {
            // If the next day's price is higher, add the difference to totalProfit
            if (prices[i + 1] > prices[i]) {
                totalProfit += prices[i + 1] - prices[i];
            }
        }
        // Step 3: Return the total profit
        return totalProfit;
    }
}