public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test cases
      String s1 = "zzazz";
      int result1 = solution.minInsertions(s1);
      System.out.println("Minimum insertions for \"" + s1 + "\": " + result1);
      
      String s2 = "mbadm";
      int result2 = solution.minInsertions(s2);
      System.out.println("Minimum insertions for \"" + s2 + "\": " + result2);
      
      String s3 = "leetcode";
      int result3 = solution.minInsertions(s3);
      System.out.println("Minimum insertions for \"" + s3 + "\": " + result3);
  }
}