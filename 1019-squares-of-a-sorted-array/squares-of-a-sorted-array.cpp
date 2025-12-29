class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int size = nums.size();

        vector<int> neg, pos;

        for (int i = 0; i < size; i++) {
            if (nums[i] < 0)
                neg.push_back(nums[i] * nums[i]);
            else
                pos.push_back(nums[i] * nums[i]);
        }

        std::reverse(neg.begin(), neg.end());

        vector<int> result;
        int p1 = 0, p2 = 0;

        while (p1 < neg.size() && p2 < pos.size()) {
            if (neg[p1] < pos[p2])
                result.push_back(neg[p1++]);
            else
                result.push_back(pos[p2++]);
        }

        while (p1 < neg.size())
            result.push_back(neg[p1++]);

        while (p2 < pos.size())
            result.push_back(pos[p2++]);

        return result;
    }
};
