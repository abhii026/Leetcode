class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int ld=n%10;
                sum+=ld;
                n/=10;
            }
            if(sum!=i){
                sum=0;
            }
            else{
                return i;
            }
        }
        return -1;
    }
}