public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      char[] letters1 = {'c', 'f', 'j'};
      char target1 = 'a';
      char result1 = solution.nextGreatestLetter(letters1, target1);
      System.out.println("Result 1: " + result1); // Expected output: 'c'
      
      // Test case 2
      char[] letters2 = {'c', 'f', 'j'};
      char target2 = 'c';
      char result2 = solution.nextGreatestLetter(letters2, target2);
      System.out.println("Result 2: " + result2); // Expected output: 'f'
      
      // Test case 3
      char[] letters3 = {'x', 'x', 'y', 'y'};
      char target3 = 'z';
      char result3 = solution.nextGreatestLetter(letters3, target3);
      System.out.println("Result 3: " + result3); // Expected output: 'x'
  }
}
