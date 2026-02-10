class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size=nums.length;
        int[] arr=new int[size];
        int in=0;
        for(int i=0; i<n; i++){
            arr[in++]=nums[i];
            arr[in++]=nums[n+i];
        }
        return arr;
    }
}