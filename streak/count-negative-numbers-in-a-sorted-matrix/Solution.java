class Solution {
  public int countNegatives(int[][] grid) {
      int count = 0;
      int m = grid.length;
      int n = grid[0].length;
      
      int i = 0; // Starting from the top-right corner
      int j = n - 1;
      
      while (i < m && j >= 0) {
          if (grid[i][j] < 0) {
              count += (m - i); // All elements below grid[i][j] will also be negative
              j--; // Move left to check for more negative numbers in the same row
          } else {
              i++; // Move down to check the next row
          }
      }
      
      return count;
  }
}

