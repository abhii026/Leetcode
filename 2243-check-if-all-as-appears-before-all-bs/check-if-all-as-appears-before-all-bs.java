class Solution {
    public boolean checkString(String s) {
        for(int i=1; i<s.length(); i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-1);
            if(ch2>ch1){
                return false;
            }
        }
        return true;
    }
}