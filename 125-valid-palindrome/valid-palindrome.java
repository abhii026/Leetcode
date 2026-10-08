class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int first=0;
        int last=s.length();
        while(first<last){
            if(s.charAt(first)!=s.charAt(last-1)){
                return false;
            }
            first++;
            last--;
        }
        return true;

    }
}