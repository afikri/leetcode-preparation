public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int m1 = 3, n1 = 7;
        int paths1 = solution.uniquePaths(m1, n1);
        System.out.println("Unique paths for m = " + m1 + ", n = " + n1 + ": " + paths1);

        // Test case 2
        int m2 = 3, n2 = 2;
        int paths2 = solution.uniquePaths(m2, n2);
        System.out.println("Unique paths for m = " + m2 + ", n = " + n2 + ": " + paths2);
    }
}
