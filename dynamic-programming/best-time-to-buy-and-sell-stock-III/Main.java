public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] prices1 = {3, 3, 5, 0, 0, 3, 1, 4};
      System.out.println(solution.maxProfit(prices1));  // Output: 6
      
      int[] prices2 = {1, 2, 3, 4, 5};
      System.out.println(solution.maxProfit(prices2));  // Output: 4
      
      int[] prices3 = {7, 6, 4, 3, 1};
      System.out.println(solution.maxProfit(prices3));  // Output: 0
  }
}
