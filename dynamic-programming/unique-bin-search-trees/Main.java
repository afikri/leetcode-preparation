public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      int n1 = 3;
      int n2 = 1;

      System.out.println("Number of structurally unique BSTs with " + n1 + " nodes: " + solution.numTrees(n1));
      System.out.println("Number of structurally unique BSTs with " + n2 + " nodes: " + solution.numTrees(n2));
  }
}