import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int n = 10;
        List<Integer> cuts = new ArrayList<>();
        cuts.add(2);
        cuts.add(4);
        cuts.add(7);
        cuts.add(9);

        int minCost = solution.minCost(n, cuts);
        System.out.println("Minimum cost: " + minCost);
    }
}
