public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int n1 = 12;
      int result1 = solution.numSquares(n1);
      System.out.println("Number of perfect squares for " + n1 + ": " + result1);

      int n2 = 13;
      int result2 = solution.numSquares(n2);
      System.out.println("Number of perfect squares for " + n2 + ": " + result2);
  }
}
