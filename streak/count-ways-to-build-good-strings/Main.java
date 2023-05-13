public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Test case 1
      int low = 3;
      int high = 3;
      int zero = 1;
      int one = 1;
      int result = solution.countGoodStrings(low, high, zero, one);
      System.out.println("Number of good strings: " + result); 
      // Expected output: 8

      // Test case 2
      low = 2;
      high = 3;
      zero = 1;
      one = 2;
      result = solution.countGoodStrings(low, high, zero, one);
      System.out.println("Number of good strings: " + result); 
      // Expected output: 5

      // Additional test case
      low = 1;
      high = 4;
      zero = 1;
      one = 1;
      result = solution.countGoodStrings(low, high, zero, one);
      System.out.println("Number of good strings: " + result); 
      // Expected output: 14
  }
}
