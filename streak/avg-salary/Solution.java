class Solution {
  public double average(int[] salary) {
      int minSalary = Integer.MAX_VALUE;
      int maxSalary = Integer.MIN_VALUE;
      int total = 0;
      int count = 0;

      for (int s : salary) {
          minSalary = Math.min(minSalary, s);
          maxSalary = Math.max(maxSalary, s);
          total += s;
          count++;
      }

      total -= minSalary;
      total -= maxSalary;
      count -= 2;

      return (double) total / count;
  }
}
