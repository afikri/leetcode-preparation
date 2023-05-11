public class Main {
  public static void main(String[] args) {
      String word1 = "horse";
      String word2 = "ros";
      
      Solution solution = new Solution();
      int minDistance = solution.minDistance(word1, word2);
      
      System.out.println("Minimum edit distance: " + minDistance);
  }
}
