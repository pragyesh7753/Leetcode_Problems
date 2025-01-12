class Solution {
    public int maxProfit(int[] prices) {

        // Step 1: Initialize variables
        int minPrice = Integer.MAX_VALUE; // To track the minimum price so far
        int maxProfit = 0; // To track the maximum profit

        // Step 2: Iterate through the prices array
        for (int price : prices) {
            // Update the minimum price if the current price is smaller
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit for the current price and update maxProfit if needed
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Step 3: Return the maximum price
        return maxProfit;
    }
}