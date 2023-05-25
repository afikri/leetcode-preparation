public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      int n1 = 10, k1 = 1, maxPts1 = 10;
      double result1 = solution.new21Game(n1, k1, maxPts1);
      System.out.println("Probability for Test Case 1: " + result1);
      
      // Test case 2
      int n2 = 6, k2 = 1, maxPts2 = 10;
      double result2 = solution.new21Game(n2, k2, maxPts2);
      System.out.println("Probability for Test Case 2: " + result2);
      
      // Test case 3
      int n3 = 21, k3 = 17, maxPts3 = 10;
      double result3 = solution.new21Game(n3, k3, maxPts3);
      System.out.println("Probability for Test Case 3: " + result3);
  }
}
