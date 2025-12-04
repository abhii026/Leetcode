class Solution {
    public int removeElement(int[] nums, int val) {
        int p=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[p++]=nums[i++];
            }
            else{
                i++;
            }
        }
        return p;        
    }
}
