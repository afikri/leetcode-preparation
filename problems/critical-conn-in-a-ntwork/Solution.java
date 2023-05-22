import java.util.*;

class Solution {
    private int time = 0; // Global timestamp variable

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // Build an adjacency list to represent the network
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (List<Integer> connection : connections) {
            int server1 = connection.get(0);
            int server2 = connection.get(1);
            graph[server1].add(server2);
            graph[server2].add(server1);
        }

        // Initialize arrays for timestamps and low values
        int[] disc = new int[n]; // Discovery timestamps
        int[] low = new int[n]; // Low timestamps
        Arrays.fill(disc, -1); // Mark all vertices as not visited

        List<List<Integer>> criticalConnections = new ArrayList<>();

        // DFS to find critical connections
        dfs(0, -1, graph, disc, low, criticalConnections);

        return criticalConnections;
    }

    private void dfs(int curr, int parent, List<Integer>[] graph, int[] disc, int[] low,
                     List<List<Integer>> criticalConnections) {
        // Set discovery timestamp and low value for the current vertex
        disc[curr] = time;
        low[curr] = time;
        time++;

        // Explore all neighboring vertices of the current vertex
        for (int neighbor : graph[curr]) {
            if (neighbor == parent) {
                continue; // Skip the immediate parent vertex
            }

            if (disc[neighbor] == -1) {
                // Neighbor vertex is not visited, so visit it
                dfs(neighbor, curr, graph, disc, low, criticalConnections);

                // Update the low value of the current vertex based on the low value of the neighbor
                low[curr] = Math.min(low[curr], low[neighbor]);

                // Check if the connection is a critical connection
                if (low[neighbor] > disc[curr]) {
                    // Current connection is a critical connection
                    criticalConnections.add(Arrays.asList(curr, neighbor));
                }
            } else {
                // Neighbor vertex is already visited, update the low value of the current vertex
                low[curr] = Math.min(low[curr], disc[neighbor]);
            }
        }
    }
}

