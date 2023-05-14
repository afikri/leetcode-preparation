public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int n = 4;
      int result = solution.tribonacci(n);
      System.out.println("Tribonacci(" + n + ") = " + result);

      n = 25;
      result = solution.tribonacci(n);
      System.out.println("Tribonacci(" + n + ") = " + result);
  }
}
