class Solution {
    public String toLowerCase(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            str.append(ch);
        }
        return str.toString();
    }
}