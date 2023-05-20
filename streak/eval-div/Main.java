import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        List<List<String>> equations1 = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] values1 = {2.0, 3.0};
        List<List<String>> queries1 = List.of(
                List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x")
        );
        double[] results1 = solution.calcEquation(equations1, values1, queries1);
        System.out.println(Arrays.toString(results1)); // Output: [6.0, 0.5, -1.0, 1.0, -1.0]

        // Example 2
        List<List<String>> equations2 = List.of(
                List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd")
        );
        double[] values2 = {1.5, 2.5, 5.0};
        List<List<String>> queries2 = List.of(
                List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc")
        );
        double[] results2 = solution.calcEquation(equations2, values2, queries2);
        System.out.println(Arrays.toString(results2)); // Output: [3.75, 0.4, 5.0, 0.2]

        // Example 3
        List<List<String>> equations3 = List.of(List.of("a", "b"));
        double[] values3 = {0.5};
        List<List<String>> queries3 = List.of(
                List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y")
        );
        double[] results3 = solution.calcEquation(equations3, values3, queries3);
        System.out.println(Arrays.toString(results3)); // Output: [0.5, 2.0, -1.0, -1.0]
    }
}
