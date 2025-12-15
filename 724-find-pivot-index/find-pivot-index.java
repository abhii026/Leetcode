class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int total1 = 0;
        for (int n : nums) {
            total1 += n;
        }
        for(int i=0; i<nums.length; i++){
            int right=total1-left-nums[i];
            if(right==left){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;
    }
}