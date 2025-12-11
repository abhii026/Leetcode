class Solution {
    public int countElements(int[] nums) {
        int Max =Maxv(nums);
        int Min =Minv(nums);
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>Min && nums[i]<Max){
                count++;
            }
        }
        return count;
    }
    int Maxv(int[] nums){
        int ma=nums[0];
        for(int i=0; i<nums.length; i++){
            if(ma<nums[i]){
                ma=nums[i];
            }
        }
        return ma;
    }
    int Minv(int[] nums){
        int mi=nums[0];
        for(int i=0; i<nums.length; i++){
            if(mi>nums[i]){
                mi=nums[i];
            }
        }
        return mi;
    }
}