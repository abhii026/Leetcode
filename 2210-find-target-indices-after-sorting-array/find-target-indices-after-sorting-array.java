class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // int[] ans=new int[];
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
    }
}