public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Example usage
      int[][] questions = {{3, 2}, {4, 3}, {4, 4}, {2, 5}};
      long maxPoints = solution.mostPoints(questions);
      System.out.println("Maximum points: " + maxPoints);
  }
}

