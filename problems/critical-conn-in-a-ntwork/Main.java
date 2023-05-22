import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int n1 = 4;
      List<List<Integer>> connections1 = new ArrayList<>();
      connections1.add(Arrays.asList(0, 1));
      connections1.add(Arrays.asList(1, 2));
      connections1.add(Arrays.asList(2, 0));
      connections1.add(Arrays.asList(1, 3));
      List<List<Integer>> result1 = solution.criticalConnections(n1, connections1);
      System.out.println("Critical Connections: " + result1);

      // Example 2
      int n2 = 2;
      List<List<Integer>> connections2 = new ArrayList<>();
      connections2.add(Arrays.asList(0, 1));
      List<List<Integer>> result2 = solution.criticalConnections(n2, connections2);
      System.out.println("Critical Connections: " + result2);
  }
}
