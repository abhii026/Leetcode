class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s= new HashSet<>();
        for(int num:nums){
            if(s.contains(num)){
                return true;
            }
            else{
                s.add(num);
            }
        }
        return false;
    }
}