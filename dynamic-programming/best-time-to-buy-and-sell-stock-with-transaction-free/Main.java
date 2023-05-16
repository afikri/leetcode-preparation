
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] prices1 = {1, 3, 2, 8, 4, 9};
      int fee1 = 2;
      System.out.println("Maximum profit: " + solution.maxProfit(prices1, fee1));
      
      int[] prices2 = {1, 3, 7, 5, 10, 3};
      int fee2 = 3;
      System.out.println("Maximum profit: " + solution.maxProfit(prices2, fee2));
  }
}
