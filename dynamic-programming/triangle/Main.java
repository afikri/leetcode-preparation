import java.util.List;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example 1
      List<List<Integer>> triangle1 = List.of(
          List.of(2),
          List.of(3, 4),
          List.of(6, 5, 7),
          List.of(4, 1, 8, 3)
      );
      int minimumSum1 = solution.minimumTotal(triangle1);
      System.out.println("Minimum path sum: " + minimumSum1);
      
      // Example 2
      List<List<Integer>> triangle2 = List.of(
          List.of(-10)
      );
      int minimumSum2 = solution.minimumTotal(triangle2);
      System.out.println("Minimum path sum: " + minimumSum2);
  }
}
