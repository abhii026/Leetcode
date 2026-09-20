class Solution {
    public boolean areOccurrencesEqual(String s) {
        // HashMap<Character,Integer> map = new HashMap<>();
        int[] fre= new int[26];
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            fre[ch-'a']++;
        }
        int v=fre[s.charAt(0)-'a'];
        for(int i=1; i<fre.length; i++){
            if(fre[i]!=0 && fre[i]!=v){
                return false;
            }
        }
        return true;
    }
}