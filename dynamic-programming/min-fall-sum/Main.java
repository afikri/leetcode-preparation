
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example 1
      int[][] matrix1 = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
      int minSum1 = solution.minFallingPathSum(matrix1);
      System.out.println("Minimum falling path sum: " + minSum1);
      
      // Example 2
      int[][] matrix2 = {{-19, 57}, {-40, -5}};
      int minSum2 = solution.minFallingPathSum(matrix2);
      System.out.println("Minimum falling path sum: " + minSum2);
  }
}
