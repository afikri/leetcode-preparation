public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Test case 1
      int[][] grid1 = {{0, 1}, {1, 0}};
      int result1 = solution.shortestPathBinaryMatrix(grid1);
      System.out.println("Output 1: " + result1); // Expected output: 2

      // Test case 2
      int[][] grid2 = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
      int result2 = solution.shortestPathBinaryMatrix(grid2);
      System.out.println("Output 2: " + result2); // Expected output: 4

      // Test case 3
      int[][] grid3 = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
      int result3 = solution.shortestPathBinaryMatrix(grid3);
      System.out.println("Output 3: " + result3); // Expected output: -1
  }
}
