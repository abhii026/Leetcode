class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2!=0){
                minOdd=Math.min(minOdd,nums1[i]);
            }
        }
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0 && minOdd != Integer.MAX_VALUE && nums1[i]<minOdd){
                return false;
            }
        }
        return true;
    }
}