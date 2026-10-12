class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        for(int i=1; i<l; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
        // int[] arr= new int[l];
        // int sum=0;
        // for(int i=0; i<l; i++){
        //     sum+=nums[i];
        //     arr[i]=sum;
        // }
        // return arr;
    }
}