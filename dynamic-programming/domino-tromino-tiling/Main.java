
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int n1 = 3;
      int result1 = solution.numTilings(n1);
      System.out.println("Number of ways to tile 2 x " + n1 + " board: " + result1);

      // Example 2
      int n2 = 1;
      int result2 = solution.numTilings(n2);
      System.out.println("Number of ways to tile 2 x " + n2 + " board: " + result2);
  }
}