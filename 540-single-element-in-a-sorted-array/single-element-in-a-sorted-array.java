class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}