public class Main {
  public static void main(String[] args) {
      int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
      System.out.println(new Solution().isBipartite(graph));

      graph = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
      System.out.println(new Solution().isBipartite(graph));
  }
}
