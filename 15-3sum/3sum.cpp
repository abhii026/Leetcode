class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        int n = nums.size();
        sort(nums.begin(), nums.end());

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = n - 1;
            int s = -nums[i];

            while(left < right){
                int sum = nums[left] + nums[right];

                if(sum == s){
                    ans.push_back({nums[i], nums[left], nums[right]});
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(sum < s){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
};
