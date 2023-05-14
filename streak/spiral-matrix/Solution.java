import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int col = colStart; col <= colEnd; col++) {
                result.add(matrix[rowStart][col]);
            }
            rowStart++;
            
            // Traverse down
            for (int row = rowStart; row <= rowEnd; row++) {
                result.add(matrix[row][colEnd]);
            }
            colEnd--;
            
            // Traverse left
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    result.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }
            
            // Traverse up
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    result.add(matrix[row][colStart]);
                }
                colStart++;
            }
        }
        
        return result;
    }
}
