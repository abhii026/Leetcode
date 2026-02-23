class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int n=s.length();
        for(int i=0; i+k<=n; i++){
            set.add(s.substring(i,i+k));
        }
        return set.size()==(1<<k);
    }
}