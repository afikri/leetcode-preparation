class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        
        for (int i = 0; i < n; i++) {
            int distinctPrefix = countDistinct(nums, 0, i);
            int distinctSuffix = countDistinct(nums, i + 1, n - 1);
            diff[i] = distinctPrefix - distinctSuffix;
        }
        
        return diff;
    }
    
    private int countDistinct(int[] nums, int start, int end) {
        boolean[] visited = new boolean[51];
        int count = 0;
        
        for (int i = start; i <= end; i++) {
            if (!visited[nums[i]]) {
                visited[nums[i]] = true;
                count++;
            }
        }
        
        return count;
    }
}
