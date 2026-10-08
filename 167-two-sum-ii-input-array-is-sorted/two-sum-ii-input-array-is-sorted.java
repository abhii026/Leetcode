class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int res=numbers[left]+numbers[right];
            if(res==target){
                return new int[] {left+1,right+1};
            }
            else if(res>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {-1,-1};
    }
}