public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      String text1 = "abcde";
      String text2 = "ace";
      int result = solution.longestCommonSubsequence(text1, text2);
      System.out.println("Length of longest common subsequence: " + result);
      
      text1 = "abc";
      text2 = "abc";
      result = solution.longestCommonSubsequence(text1, text2);
      System.out.println("Length of longest common subsequence: " + result);
      
      text1 = "abc";
      text2 = "def";
      result = solution.longestCommonSubsequence(text1, text2);
      System.out.println("Length of longest common subsequence: " + result);
  }
}
