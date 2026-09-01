class Solution {
    public String removeStars(String s) {
        Stack<Character> st= new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        StringBuilder res=new StringBuilder();
        for(char ch: st){
            res.append(ch);
        }
        return res.toString();
    }
}