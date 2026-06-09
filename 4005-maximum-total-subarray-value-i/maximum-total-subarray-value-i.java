class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=nums[0];
        long min=nums[0];
        long sum=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        long diff=max-min;
        // for(int i=0; i<k; i++){
        //     sum+=diff;
        // }
        return diff*k;
    }
}