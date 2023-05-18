class Solution {
  public int mincostTickets(int[] days, int[] costs) {
      int[] dp = new int[366]; // Array to store the minimum cost for each day
      
      // Base case: no travel required
      dp[0] = 0;
      
      // Array to keep track of the travel days
      boolean[] travelDays = new boolean[366];
      
      // Mark the travel days as true
      for (int day : days) {
          travelDays[day] = true;
      }
      
      for (int i = 1; i <= 365; i++) {
          // If it's not a travel day, cost remains the same as the previous day
          if (!travelDays[i]) {
              dp[i] = dp[i - 1];
              continue;
          }
          
          // Calculate the cost for 1-day pass
          int oneDayPass = dp[i - 1] + costs[0];
          
          // Calculate the cost for 7-day pass
          int sevenDayPass = dp[Math.max(0, i - 7)] + costs[1];
          
          // Calculate the cost for 30-day pass
          int thirtyDayPass = dp[Math.max(0, i - 30)] + costs[2];
          
          // Choose the minimum cost among the available pass options
          dp[i] = Math.min(oneDayPass, Math.min(sevenDayPass, thirtyDayPass));
      }
      
      // The minimum cost for the last day of the year will be the answer
      return dp[365];
  }
}

