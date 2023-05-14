class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (k >= n / 2) {
            // If k is greater than or equal to half the number of days,
            // we can perform as many transactions as we want.
            // In this case, we can reduce the problem to the problem of
            // finding maximum profit with unlimited transactions.
            return maxProfitWithUnlimitedTransactions(prices);
        }

        // Create a dynamic programming array to store the maximum profit.
        int[][] dp = new int[k + 1][n];

        // Iterate for each transaction.
        for (int i = 1; i <= k; i++) {
            // Track the maximum profit that can be achieved with i transactions on the jth day.
            int maxDiff = -prices[0];
            for (int j = 1; j < n; j++) {
                // Update the maximum profit at dp[i][j] by considering two possibilities:
                // 1. Not performing any transaction on the jth day.
                // 2. Selling the stock on the jth day and buying on any of the previous days
                //    to maximize the profit.
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
                // Update the maximum difference (profit - price) that can be achieved with i
                // transactions on the jth day.
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - prices[j]);
            }
        }

        // The maximum profit can be obtained by performing k transactions on the last day.
        return dp[k][n - 1];
    }

    private int maxProfitWithUnlimitedTransactions(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the price of the stock is increasing, add the difference to the maximum profit.
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
