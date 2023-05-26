public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[] piles1 = {2, 7, 9, 4, 4};
      int maxStones1 = solution.stoneGameII(piles1);
      System.out.println("Maximum number of stones Alice can get: " + maxStones1); // Output: 10

      int[] piles2 = {1, 2, 3, 4, 5, 100};
      int maxStones2 = solution.stoneGameII(piles2);
      System.out.println("Maximum number of stones Alice can get: " + maxStones2); // Output: 104
  }
}
