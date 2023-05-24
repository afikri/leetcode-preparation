class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        // Ensure nums1 is the smaller array
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int leftHalfLen = (m + n + 1) / 2;
        int left = 0;
        int right = m;
        
        while (left < right) {
            int mid1 = left + (right - left) / 2;
            int mid2 = leftHalfLen - mid1;
            
            if (nums1[mid1] < nums2[mid2 - 1]) {
                left = mid1 + 1;
            } else {
                right = mid1;
            }
        }
        
        int mid1 = left;
        int mid2 = leftHalfLen - left;
        
        int num1 = Math.max(mid1 > 0 ? nums1[mid1 - 1] : Integer.MIN_VALUE,
                            mid2 > 0 ? nums2[mid2 - 1] : Integer.MIN_VALUE);
        
        if ((m + n) % 2 == 1) {
            return num1;
        }
        
        int num2 = Math.min(mid1 < m ? nums1[mid1] : Integer.MAX_VALUE,
                            mid2 < n ? nums2[mid2] : Integer.MAX_VALUE);
        
        return (num1 + num2) / 2.0;
    }
}
