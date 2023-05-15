
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      char[][] matrix1 = {
          {'1','0','1','0','0'},
          {'1','0','1','1','1'},
          {'1','1','1','1','1'},
          {'1','0','0','1','0'}
      };
      System.out.println(solution.maximalSquare(matrix1)); // Output: 4
      
      char[][] matrix2 = {
          {'0','1'},
          {'1','0'}
      };
      System.out.println(solution.maximalSquare(matrix2)); // Output: 1
      
      char[][] matrix3 = {
          {'0'}
      };
      System.out.println(solution.maximalSquare(matrix3)); // Output: 0
  }
}
