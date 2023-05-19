public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      String[] strs1 = {"10", "0001", "111001", "1", "0"};
      int m1 = 5;
      int n1 = 3;
      System.out.println(solution.findMaxForm(strs1, m1, n1)); // Output: 4
      
      String[] strs2 = {"10", "0", "1"};
      int m2 = 1;
      int n2 = 1;
      System.out.println(solution.findMaxForm(strs2, m2, n2)); // Output: 2
  }
}
