public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[][] grid1 = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
      int count1 = solution.countNegatives(grid1);
      System.out.println("Count of negatives in grid1: " + count1);
      
      int[][] grid2 = {{3, 2}, {1, 0}};
      int count2 = solution.countNegatives(grid2);
      System.out.println("Count of negatives in grid2: " + count2);
  }
}
