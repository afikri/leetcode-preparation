import java.util.ArrayList;

class Solution {
  public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
      int n = obstacles.length;
      int[] dp = new int[n]; // dp[i] stores the length of the longest obstacle course ending at position i
      ArrayList<Integer> courses = new ArrayList<>(); // courses stores the courses encountered so far
      for (int i = 0; i < n; i++) {
          int obstacle = obstacles[i];
          int index = upperBound(courses, obstacle);
          if (index == courses.size()) {
              courses.add(obstacle);
          } else {
              courses.set(index, obstacle);
          }
          dp[i] = index + 1;
      }
      return dp;
  }
  
  // Binary search implementation to find the index of the first element greater than target in the list
  private int upperBound(ArrayList<Integer> list, int target) {
      int left = 0;
      int right = list.size();
      while (left < right) {
          int mid = left + (right - left) / 2;
          if (list.get(mid) > target) {
              right = mid;
          } else if (list.get(mid) == target) {
              left = mid + 1;
          } else {
              left = mid + 1;
          }
      }
      return left;
  }
}
