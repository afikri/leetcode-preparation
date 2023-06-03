
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example 1
      int n1 = 1;
      int headID1 = 0;
      int[] manager1 = {-1};
      int[] informTime1 = {0};
      int result1 = solution.numOfMinutes(n1, headID1, manager1, informTime1);
      System.out.println("Output: " + result1);  // Expected: 0
      
      // Example 2
      int n2 = 6;
      int headID2 = 2;
      int[] manager2 = {2, 2, -1, 2, 2, 2};
      int[] informTime2 = {0, 0, 1, 0, 0, 0};
      int result2 = solution.numOfMinutes(n2, headID2, manager2, informTime2);
      System.out.println("Output: " + result2);  // Expected: 1
  }
}
