class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length()-1;
        int count=0;
        while(l>=0 && s.charAt(l)==' '){
            l--;
        }
        while(l>=0 && s.charAt(l)!=' '){
            count++;
            l--;
        }
        return count;
    }
}