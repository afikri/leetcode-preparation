public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] coins1 = {1, 2, 5};
      int amount1 = 11;
      System.out.println(solution.coinChange(coins1, amount1)); // Output: 3
      
      int[] coins2 = {2};
      int amount2 = 3;
      System.out.println(solution.coinChange(coins2, amount2)); // Output: -1
      
      int[] coins3 = {1};
      int amount3 = 0;
      System.out.println(solution.coinChange(coins3, amount3)); // Output: 0
  }
}
