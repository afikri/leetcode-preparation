import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] obstacles1 = {1, 2, 3, 2};
      int[] ans1 = solution.longestObstacleCourseAtEachPosition(obstacles1);
      System.out.println("Output 1: " + Arrays.toString(ans1));
      // Expected Output: [1, 2, 3, 3]
      
      int[] obstacles2 = {2, 2, 1};
      int[] ans2 = solution.longestObstacleCourseAtEachPosition(obstacles2);
      System.out.println("Output 2: " + Arrays.toString(ans2));
      // Expected Output: [1, 2, 1]
      
      int[] obstacles3 = {3, 1, 5, 6, 4, 2};
      int[] ans3 = solution.longestObstacleCourseAtEachPosition(obstacles3);
      System.out.println("Output 3: " + Arrays.toString(ans3));
      // Expected Output: [1, 1, 2, 3, 2, 2]
  }
}
