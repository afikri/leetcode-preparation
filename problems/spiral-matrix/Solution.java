class Solution {
  public int[][] generateMatrix(int n) {
      int[][] matrix = new int[n][n];
      int num = 1; // Starting number
      int rowStart = 0, rowEnd = n - 1; // Bounds for rows
      int colStart = 0, colEnd = n - 1; // Bounds for columns
      
      while (num <= n * n) {
          // Traverse right
          for (int i = colStart; i <= colEnd; i++) {
              matrix[rowStart][i] = num++;
          }
          rowStart++;
          
          // Traverse down
          for (int i = rowStart; i <= rowEnd; i++) {
              matrix[i][colEnd] = num++;
          }
          colEnd--;
          
          // Traverse left
          if (rowStart <= rowEnd) {
              for (int i = colEnd; i >= colStart; i--) {
                  matrix[rowEnd][i] = num++;
              }
              rowEnd--;
          }
          
          // Traverse up
          if (colStart <= colEnd) {
              for (int i = rowEnd; i >= rowStart; i--) {
                  matrix[i][colStart] = num++;
              }
              colStart++;
          }
      }
      
      return matrix;
  }
}
