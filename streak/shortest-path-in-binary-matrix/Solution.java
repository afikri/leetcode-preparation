import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1; // No clear path from start to end
        }

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1; // Mark the starting cell as visited

        int pathLength = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            pathLength++;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int currRow = curr[0];
                int currCol = curr[1];

                if (currRow == n - 1 && currCol == n - 1) {
                    return pathLength; // Reached the destination
                }

                for (int[] dir : directions) {
                    int newRow = currRow + dir[0];
                    int newCol = currCol + dir[1];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                        queue.offer(new int[]{newRow, newCol});
                        grid[newRow][newCol] = 1; // Mark the cell as visited
                    }
                }
            }
        }

        return -1; // No clear path from start to end
    }
}

