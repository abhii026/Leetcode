class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=0;
        int j=1;
        while(j<nums.size()){
            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];
            }
            else{
                j++;
            }
        }
        return i+1;;
    }
};