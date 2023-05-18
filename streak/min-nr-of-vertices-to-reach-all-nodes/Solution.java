import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] reachable = new boolean[n];

        for (List<Integer> edge : edges) {
            int to = edge.get(1);
            reachable[to] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!reachable[i]) {
                result.add(i);
            }
        }

        return result;
    }
}

