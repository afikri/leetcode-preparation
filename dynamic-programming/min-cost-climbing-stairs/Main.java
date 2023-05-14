public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example 1
      int[] cost1 = {10, 15, 20};
      int result1 = solution.minCostClimbingStairs(cost1);
      System.out.println("Minimum cost for example 1: " + result1);
      
      // Example 2
      int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
      int result2 = solution.minCostClimbingStairs(cost2);
      System.out.println("Minimum cost for example 2: " + result2);
  }
}
