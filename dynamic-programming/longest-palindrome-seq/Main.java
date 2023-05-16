public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      String s1 = "bbbab";
      int result1 = solution.longestPalindromeSubseq(s1);
      System.out.println("Longest palindromic subsequence length for '" + s1 + "': " + result1);

      String s2 = "cbbd";
      int result2 = solution.longestPalindromeSubseq(s2);
      System.out.println("Longest palindromic subsequence length for '" + s2 + "': " + result2);
  }
}
