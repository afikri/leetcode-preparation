class Solution {
  public int diagonalSum(int[][] mat) {
      int n = mat.length;
      int sum = 0;
      
      for (int i = 0; i < n; i++) {
          sum += mat[i][i]; // Add elements from primary diagonal
          sum += mat[i][n - i - 1]; // Add elements from secondary diagonal
      }
      
      // If the matrix has an odd size, subtract the duplicate element in the center
      if (n % 2 == 1) {
          sum -= mat[n / 2][n / 2];
      }
      
      return sum;
  }
}
