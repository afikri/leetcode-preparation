import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public int shortestBridge(int[][] grid) {
        int n = grid.length;

        // Step 1: Find the first island and mark all its cells as -1
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (found) {
                break;
            }
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    found = true;
                    break;
                }
            }
        }

        // Step 2: BFS to find the shortest path to the second island
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int steps = 0;

        // Add all cells of the first island to the queue and mark them as visited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];

                for (int[] direction : DIRECTIONS) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                        if (grid[newRow][newCol] == 1) {
                            return steps;
                        }
                        queue.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }
            steps++;
        }

        return -1; // In case there is no path
    }

    private void dfs(int[][] grid, int row, int col) {
        int n = grid.length;

        if (row < 0 || row >= n || col < 0 || col >= n || grid[row][col] != 1) {
            return;
        }

        grid[row][col] = -1; // Mark the cell as visited

        // Recursively visit all neighboring cells
        for (int[] direction : DIRECTIONS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            dfs(grid, newRow, newCol);
        }
    }
}