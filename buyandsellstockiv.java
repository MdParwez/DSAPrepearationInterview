class Solution {
    public int maxProfit(int k, int[] prices) {
        // Check if the array is empty, in which case the profit is zero
        if (prices.length == 0) {
            return 0;
        }

        // Create a 2D array to store the dynamic programming results
        // dp[i][j] represents the maximum profit with at most i transactions
        // and considering prices[0] to prices[j] days
        int dp[][] = new int[k + 1][prices.length];

        // Iterate over the transactions
        for (int i = 1; i < dp.length; i++) {
            // Initialize the maximum difference for the current transaction
            int maxDiff = -prices[0];

            // Iterate over the days
            for (int j = 1; j < dp[0].length; j++) {
                // Update the maximum difference considering the current price
                maxDiff = Math.max(maxDiff, dp[i - 1][j - 1] - prices[j - 1]);

                // Update the maximum profit for the current transaction and day
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
            }
        }

        // Return the maximum profit with at most k transactions and considering all prices
        return dp[k][prices.length - 1];
    }
}
