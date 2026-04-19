class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int maxD = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                maxD = Math.max(maxD, j - i);
                j++;  
            } else {
                i++;  
            }
        }

        return maxD;
    }
}