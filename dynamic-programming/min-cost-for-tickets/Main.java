public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      int[] days1 = {1, 4, 6, 7, 8, 20};
      int[] costs1 = {2, 7, 15};
      int minCost1 = solution.mincostTickets(days1, costs1);
      System.out.println("Minimum cost for Test Case 1: " + minCost1);
      
      // Test case 2
      int[] days2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
      int[] costs2 = {2, 7, 15};
      int minCost2 = solution.mincostTickets(days2, costs2);
      System.out.println("Minimum cost for Test Case 2: " + minCost2);
  }
}
