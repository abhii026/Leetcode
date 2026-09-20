class Solution { 
    public boolean isIsomorphic(String s, String t) { 
        if(s.length()!=t.length()) return false; 

        HashMap<Character,Character> map = new HashMap<>(); 
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<s.length(); i++){ 
            char first = s.charAt(i); 
            char second = t.charAt(i); 

            if(map.containsKey(first)){ 
                if(map.get(first)!=second){ 
                    return false; 
                } 
            } 
            else{ 
                if(set.contains(second)){
                    return false;
                }

                map.put(first,second);
                set.add(second);
            } 
        }

        return true;
    } 
}
