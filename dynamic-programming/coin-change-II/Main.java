
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int amount1 = 5;
      int[] coins1 = {1, 2, 5};
      int result1 = solution.change(amount1, coins1);
      System.out.println("Result 1: " + result1); // Output: 4

      int amount2 = 3;
      int[] coins2 = {2};
      int result2 = solution.change(amount2, coins2);
      System.out.println("Result 2: " + result2); // Output: 0

      int amount3 = 10;
      int[] coins3 = {10};
      int result3 = solution.change(amount3, coins3);
      System.out.println("Result 3: " + result3); // Output: 1
  }
}
