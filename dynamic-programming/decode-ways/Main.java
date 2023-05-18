public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example test cases
      String s1 = "12";
      System.out.println("Number of decodings for " + s1 + ": " + solution.numDecodings(s1));
      
      String s2 = "226";
      System.out.println("Number of decodings for " + s2 + ": " + solution.numDecodings(s2));
      
      String s3 = "06";
      System.out.println("Number of decodings for " + s3 + ": " + solution.numDecodings(s3));
  }
}
