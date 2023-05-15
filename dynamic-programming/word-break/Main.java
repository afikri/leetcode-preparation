import java.util.List;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      String s1 = "leetcode";
      List<String> wordDict1 = List.of("leet", "code");
      boolean result1 = solution.wordBreak(s1, wordDict1);
      System.out.println(result1);  // Output: true

      String s2 = "applepenapple";
      List<String> wordDict2 = List.of("apple", "pen");
      boolean result2 = solution.wordBreak(s2, wordDict2);
      System.out.println(result2);  // Output: true

      String s3 = "catsandog";
      List<String> wordDict3 = List.of("cats", "dog", "sand", "and", "cat");
      boolean result3 = solution.wordBreak(s3, wordDict3);
      System.out.println(result3);  // Output: false
  }
}