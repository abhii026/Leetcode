class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mx=nums[0];
        long mn=nums[0];
        long sum=0;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        for(int x: nums){
            mx=Math.max(mx,x);
            mn=Math.min(mn,x);
        }
        long diff=mx-mn;
        return diff*k;
    }
}