public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int n1 = 2;
      int ways1 = solution.climbStairs(n1);
      System.out.println("Number of ways to climb " + n1 + " steps: " + ways1);
      
      int n2 = 3;
      int ways2 = solution.climbStairs(n2);
      System.out.println("Number of ways to climb " + n2 + " steps: " + ways2);
  }
}
