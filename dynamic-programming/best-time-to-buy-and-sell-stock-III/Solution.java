class Solution {
  public int maxProfit(int[] prices) {
      int n = prices.length;
      
      // Create arrays to store the maximum profit for the first and second transactions
      int[] firstTransaction = new int[n];
      int[] secondTransaction = new int[n];
      
      // Calculate the maximum profit for the first transaction
      int minPrice = prices[0];
      for (int i = 1; i < n; i++) {
          minPrice = Math.min(minPrice, prices[i]);
          firstTransaction[i] = Math.max(firstTransaction[i - 1], prices[i] - minPrice);
      }
      
      // Calculate the maximum profit for the second transaction
      int maxPrice = prices[n - 1];
      for (int i = n - 2; i >= 0; i--) {
          maxPrice = Math.max(maxPrice, prices[i]);
          secondTransaction[i] = Math.max(secondTransaction[i + 1], maxPrice - prices[i]);
      }
      
      // Find the maximum profit by combining the maximum profits from the first and second transactions
      int maxProfit = 0;
      for (int i = 0; i < n; i++) {
          maxProfit = Math.max(maxProfit, firstTransaction[i] + secondTransaction[i]);
      }
      
      return maxProfit;
  }
}
