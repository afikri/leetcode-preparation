public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] obstacleGrid1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int uniquePaths1 = solution.uniquePathsWithObstacles(obstacleGrid1);
        System.out.println("Unique paths in obstacleGrid1: " + uniquePaths1);

        int[][] obstacleGrid2 = {{0, 1}, {0, 0}};
        int uniquePaths2 = solution.uniquePathsWithObstacles(obstacleGrid2);
        System.out.println("Unique paths in obstacleGrid2: " + uniquePaths2);
    }
}
