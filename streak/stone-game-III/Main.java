public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] values1 = {1, 2, 3, 7};
        String result1 = solution.stoneGameIII(values1);
        System.out.println(result1); // Output: Bob

        // Example 2
        int[] values2 = {1, 2, 3, -9};
        String result2 = solution.stoneGameIII(values2);
        System.out.println(result2); // Output: Alice

        // Example 3
        int[] values3 = {1, 2, 3, 6};
        String result3 = solution.stoneGameIII(values3);
        System.out.println(result3); // Output: Tie
    }
}
