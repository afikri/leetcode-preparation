import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int n1 = 6;
      List<List<Integer>> edges1 = new ArrayList<>();
      edges1.add(List.of(0, 1));
      edges1.add(List.of(0, 2));
      edges1.add(List.of(2, 5));
      edges1.add(List.of(3, 4));
      edges1.add(List.of(4, 2));
      List<Integer> result1 = solution.findSmallestSetOfVertices(n1, edges1);
      System.out.println(result1);  // [0, 3]

      // Example 2
      int n2 = 5;
      List<List<Integer>> edges2 = new ArrayList<>();
      edges2.add(List.of(0, 1));
      edges2.add(List.of(2, 1));
      edges2.add(List.of(3, 1));
      edges2.add(List.of(1, 4));
      edges2.add(List.of(2, 4));
      List<Integer> result2 = solution.findSmallestSetOfVertices(n2, edges2);
      System.out.println(result2);  // [0, 2, 3]
  }
}
