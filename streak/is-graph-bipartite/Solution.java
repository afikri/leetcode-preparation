class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color1 = new int[graph.length];
        int[] color2 = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (color1[i] == 0) {
                if (!isBipartite(graph, i, 1, color1, color2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isBipartite(int[][] graph, int u, int color, int[] color1, int[] color2) {
        color1[u] = color;
        for (int v : graph[u]) {
            if (color1[v] == color) {
                return false;
            } else if (color1[v] == 0) {
                if (!isBipartite(graph, v, 3 - color, color1, color2)) {
                    return false;
                }
            } else if (color2[v] == color) {
                return false;
            } else if (color2[v] == 0) {
                color2[v] = 3 - color;
            }
        }
        return true;
    }
}

