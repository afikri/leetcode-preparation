
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[][] bombs1 = {{2, 1, 3}, {6, 1, 4}};
      System.out.println("Maximum detonation for bombs1: " + solution.maximumDetonation(bombs1));

      int[][] bombs2 = {{1, 1, 5}, {10, 10, 5}};
      System.out.println("Maximum detonation for bombs2: " + solution.maximumDetonation(bombs2));

      int[][] bombs3 = {{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}};
      System.out.println("Maximum detonation for bombs3: " + solution.maximumDetonation(bombs3));
  }
}