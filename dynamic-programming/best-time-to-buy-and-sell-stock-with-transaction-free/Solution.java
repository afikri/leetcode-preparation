class Solution {
  public int maxProfit(int[] prices, int fee) {
      int n = prices.length;
      int buyingPrice = prices[0] + fee; // Initial buying price
      int profit = 0;
      
      for (int i = 1; i < n; i++) {
          // Check if the current price is lower than the previous buying price
          if (prices[i] + fee < buyingPrice) {
              buyingPrice = prices[i] + fee; // Update the buying price
          }
          // Check if selling the stock at the current price would generate a profit
          else if (prices[i] > buyingPrice) {
              profit += prices[i] - buyingPrice; // Sell the stock and add the profit
              buyingPrice = prices[i]; // Update the buying price
          }
      }
      
      return profit;
  }
}
