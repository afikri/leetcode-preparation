public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      String s1 = "aaabc";
      int length1 = solution.minimizedStringLength(s1);
      System.out.println("Minimized length of " + s1 + ": " + length1);
      
      String s2 = "cbbd";
      int length2 = solution.minimizedStringLength(s2);
      System.out.println("Minimized length of " + s2 + ": " + length2);
      
      String s3 = "dddaaa";
      int length3 = solution.minimizedStringLength(s3);
      System.out.println("Minimized length of " + s3 + ": " + length3);
  }
}