public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      String s1 = "rabbbit";
      String t1 = "rabbit";
      int result1 = solution.numDistinct(s1, t1);
      System.out.println("Result 1: " + result1); // Output: 3
      
      String s2 = "babgbag";
      String t2 = "bag";
      int result2 = solution.numDistinct(s2, t2);
      System.out.println("Result 2: " + result2); // Output: 5
  }
}
