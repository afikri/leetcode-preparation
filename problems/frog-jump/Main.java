public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example 1
      int[] stones1 = {0, 1, 3, 5, 6, 8, 12, 17};
      boolean result1 = solution.canCross(stones1);
      System.out.println("Example 1: " + result1); // Expected output: true
      
      // Example 2
      int[] stones2 = {0, 1, 2, 3, 4, 8, 9, 11};
      boolean result2 = solution.canCross(stones2);
      System.out.println("Example 2: " + result2); // Expected output: false
      
      // Custom test case
      int[] stones3 = {0, 1, 3, 6, 10, 15, 21};
      boolean result3 = solution.canCross(stones3);
      System.out.println("Custom Test Case: " + result3); // Expected output: true
  }
}
