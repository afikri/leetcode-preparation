import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result1 = solution.spiralOrder(matrix1);
        System.out.println("Matrix 1:");
        System.out.println(matrixToString(matrix1));
        System.out.println("Spiral Order:");
        System.out.println(result1);

        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result2 = solution.spiralOrder(matrix2);
        System.out.println("Matrix 2:");
        System.out.println(matrixToString(matrix2));
        System.out.println("Spiral Order:");
        System.out.println(result2);
    }

    private static String matrixToString(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            sb.append("[");
            for (int num : row) {
                sb.append(num).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()); // Remove the last ", "
            sb.append("]\n");
        }
        return sb.toString();
    }
}
