import java.util.List;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int n1 = 3;
      List<TreeNode> result1 = solution.generateTrees(n1);
      System.out.println("n = " + n1);
      System.out.println("Output: " + result1);

      // Example 2
      int n2 = 1;
      List<TreeNode> result2 = solution.generateTrees(n2);
      System.out.println("n = " + n2);
      System.out.println("Output: " + result2);
  }
}
