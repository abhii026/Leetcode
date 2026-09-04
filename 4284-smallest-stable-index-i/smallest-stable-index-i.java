class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int maxL=nums[0];
            int minR=nums[i];
            for(int j=0; j<=i; j++){
                maxL=Math.max(maxL, nums[j]);
            }
            for(int j=i; j<nums.length; j++){
                minR=Math.min(minR, nums[j]);
            }
            int instable=maxL-minR;
            if(instable<=k){
                return i;
            }
        }
        return -1;
    }
}