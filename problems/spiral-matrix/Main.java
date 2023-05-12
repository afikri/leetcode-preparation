public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Test case 1
      int n1 = 3;
      int[][] matrix1 = solution.generateMatrix(n1);
      System.out.println("Matrix 1:");
      printMatrix(matrix1);

      // Test case 2
      int n2 = 1;
      int[][] matrix2 = solution.generateMatrix(n2);
      System.out.println("Matrix 2:");
      printMatrix(matrix2);

      // Test case 3
      int n3 = 4;
      int[][] matrix3 = solution.generateMatrix(n3);
      System.out.println("Matrix 3:");
      printMatrix(matrix3);
  }

  private static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
      System.out.println();
  }
}
