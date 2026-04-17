class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>  dupNum=new HashSet<>();
        for(int i:nums){
            if(dupNum.contains(i)){
                return true;
            }
            dupNum.add(i);
        }
        return false;
    }
}