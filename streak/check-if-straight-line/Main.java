public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[][] coordinates1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
      boolean result1 = solution.checkStraightLine(coordinates1);
      System.out.println("Output 1: " + result1); // Expected output: true
      
      int[][] coordinates2 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
      boolean result2 = solution.checkStraightLine(coordinates2);
      System.out.println("Output 2: " + result2); // Expected output: false
  }
}
