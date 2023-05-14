public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int[] prices1 = {2, 4, 1};
      int k1 = 2;
      int maxProfit1 = solution.maxProfit(k1, prices1);
      System.out.println("Maximum profit for example 1: " + maxProfit1);

      // Additional test cases
      int[] prices2 = {3, 2, 6, 5, 0, 3};
      int k2 = 2;
      int maxProfit2 = solution.maxProfit(k2, prices2);
      System.out.println("Maximum profit for additional test case 1: " + maxProfit2);

      int[] prices3 = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
      int k3 = 3;
      int maxProfit3 = solution.maxProfit(k3, prices3);
      System.out.println("Maximum profit for additional test case 2: " + maxProfit3);
  }
}
