public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int a1 = 2, b1 = 6, c1 = 5;
      int flips1 = solution.minFlips(a1, b1, c1);
      System.out.println("Example 1: " + flips1); // Output: 3

      // Example 2
      int a2 = 4, b2 = 2, c2 = 7;
      int flips2 = solution.minFlips(a2, b2, c2);
      System.out.println("Example 2: " + flips2); // Output: 1

      // Example 3
      int a3 = 1, b3 = 2, c3 = 3;
      int flips3 = solution.minFlips(a3, b3, c3);
      System.out.println("Example 3: " + flips3); // Output: 0
  }
}
