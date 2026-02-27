class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int l=0;
        int r=needle.length()-1;
        int match=hashcode(needle,l,r);
        int newhash=hashcode(haystack,l,r);
        while(l<haystack.length()){
            if(match==newhash && equal(haystack.substring(l,r+1),needle)) return l;
            newhash-=haystack.charAt(l);
            l++;
            r++;
            if(r<haystack.length()){
                newhash+=haystack.charAt(r);
            }
        }
        return -1;
    }
    static boolean equal(String s, String n){
        return s.equals(n);
    }
    static int hashcode(String s, int left,int right){
        int code=0;
        for(int i=left; i<=right; i++){
            code+=s.charAt(i);
        }
        return code;
    }
}