class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int maxL=nums[0];
            int minR=nums[i];
            for(int j=0; j<i; j++){
                maxL=Math.max(maxL,nums[j]);
            }
            for(int j=i; j<n; j++){
                minR=Math.min(minR,nums[j]);
            }
            int score = maxL - minR;

            if (score <= k) {
                return i;
            }
        }
        return -1;
    }
}