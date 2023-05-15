public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example test cases
      System.out.println(solution.isMatch("aa", "a"));      // false
      System.out.println(solution.isMatch("aa", "a*"));     // true
      System.out.println(solution.isMatch("ab", ".*"));     // true
  }
}
