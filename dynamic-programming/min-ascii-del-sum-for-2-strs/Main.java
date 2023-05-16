public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      String s1 = "sea";
      String s2 = "eat";
      int result1 = solution.minimumDeleteSum(s1, s2);
      System.out.println("Minimum ASCII sum: " + result1); // Output: 231
      
      // Test case 2
      String s3 = "delete";
      String s4 = "leet";
      int result2 = solution.minimumDeleteSum(s3, s4);
      System.out.println("Minimum ASCII sum: " + result2); // Output: 403
  }
}
