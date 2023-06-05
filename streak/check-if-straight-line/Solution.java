class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true; // If there are only two points, they always form a straight line
        }
        
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int[] currPoint = coordinates[i];
            int x1 = point1[0];
            int y1 = point1[1];
            int x2 = point2[0];
            int y2 = point2[1];
            int x3 = currPoint[0];
            int y3 = currPoint[1];
            
            if ((y2 - y1) * (x3 - x1) != (y3 - y1) * (x2 - x1)) {
                return false; // If the points don't lie on the same line, return false
            }
        }
        
        return true; // All points lie on the same line
    }
}

