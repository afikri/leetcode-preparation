public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[][] isConnected1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
      System.out.println(solution.findCircleNum(isConnected1)); // Output: 2
      
      int[][] isConnected2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
      System.out.println(solution.findCircleNum(isConnected2)); // Output: 3
  }
}
