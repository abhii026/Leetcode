class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int curr1=0; int prev1=0;
        for(int i =0; i<n;i++){
            int temp=Math.max(curr1,prev1+nums[i]);
            prev1=curr1;
            curr1=temp; 
        }
        return curr1;
        // int curr2=0;
        // int prev2=0;
        // for(int i=1;i<n;i++){
        //     int temp=Math.max(curr2,prev2+nums[i]);
        //     prev2=curr2;
        //     curr2=temp;
        // }         
        // return Math.max(curr1,curr2);
    }
}