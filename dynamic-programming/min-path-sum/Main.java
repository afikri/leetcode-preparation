public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
      int minPathSum1 = solution.minPathSum(grid1);
      System.out.println("Minimum path sum (Example 1): " + minPathSum1);
      
      int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
      int minPathSum2 = solution.minPathSum(grid2);
      System.out.println("Minimum path sum (Example 2): " + minPathSum2);
  }
}
