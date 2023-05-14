public class Main {
  public static void main(String[] args) {
      // Test case 1
      int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      Solution solution = new Solution();
      int result1 = solution.diagonalSum(mat1);
      System.out.println("Result 1: " + result1); // Expected output: 25
      
      // Test case 2
      int[][] mat2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
      int result2 = solution.diagonalSum(mat2);
      System.out.println("Result 2: " + result2); // Expected output: 8
      
      // Test case 3
      int[][] mat3 = {{5}};
      int result3 = solution.diagonalSum(mat3);
      System.out.println("Result 3: " + result3); // Expected output: 5
  }
}
