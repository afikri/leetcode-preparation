
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] prices1 = {1, 2, 3, 0, 2};
      System.out.println("Max profit: " + solution.maxProfit(prices1)); // Output: 3
      
      int[] prices2 = {1};
      System.out.println("Max profit: " + solution.maxProfit(prices2)); // Output: 0
  }
}
