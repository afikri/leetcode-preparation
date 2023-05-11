class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int[] salary1 = {4000, 3000, 1000, 2000};
      double average1 = solution.average(salary1);
      System.out.println("Average Salary 1: " + average1); // Expected output: 2500.0

      // Example 2
      int[] salary2 = {1000, 2000, 3000};
      double average2 = solution.average(salary2);
      System.out.println("Average Salary 2: " + average2); // Expected output: 2000.0
  }
}
