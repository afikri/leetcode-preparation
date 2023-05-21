public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid1 = {{0, 1}, {1, 0}};
        System.out.println("Output for grid1: " + solution.shortestBridge(grid1));

        int[][] grid2 = {{0, 1, 0}, {0, 0, 0}, {0, 0, 1}};
        System.out.println("Output for grid2: " + solution.shortestBridge(grid2));

        int[][] grid3 = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };
        System.out.println("Output for grid3: " + solution.shortestBridge(grid3));
    }
}
