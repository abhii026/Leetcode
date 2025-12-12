class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=0;
        int max_sum=nums[0];
        for(int i=0; i<nums.length; i++){
            current_sum+=nums[i];
            max_sum=Math.max(current_sum, max_sum);
            if(current_sum<0){
                current_sum=0;
            }
        }
        return max_sum;
    }
}