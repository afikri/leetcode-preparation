class Solution {
  public int maxProfit(int[] prices) {
      int n = prices.length;
      
      if (n <= 1) {
          return 0;
      }
      
      int[] buy = new int[n];  // Maximum profit when the last action is buying
      int[] sell = new int[n]; // Maximum profit when the last action is selling
      
      buy[0] = -prices[0];    // Buy the first stock
      sell[0] = 0;            // No stock to sell
      
      for (int i = 1; i < n; i++) {
          int price = prices[i];
          
          // The maximum profit after buying the stock on day i is either:
          // 1. Continuing to hold the stock bought on day i-1 (buy[i-1])
          // 2. Buying the stock on day i (sell[i-2] - price)
          buy[i] = Math.max(buy[i-1], (i >= 2 ? sell[i-2] : 0) - price);
          
          // The maximum profit after selling the stock on day i is either:
          // 1. Continuing to hold the stock sold on day i-1 (sell[i-1])
          // 2. Selling the stock bought on day i (buy[i-1] + price)
          sell[i] = Math.max(sell[i-1], buy[i-1] + price);
      }
      
      return sell[n-1]; // Maximum profit is achieved by selling the stock at the end
  }
}
