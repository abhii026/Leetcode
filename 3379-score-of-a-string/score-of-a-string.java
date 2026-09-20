class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0; i<s.length()-1; i++){
            int val=Math.abs(s.charAt(i)-s.charAt(i+1));
            sum+=val;
        }
        return sum;
    }
}