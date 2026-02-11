import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        // Stack<Character> s=new Stack<>();
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' ||c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())return false;
                char t=stack.peek();
                stack.pop();
                if(c==')' && t!='(' || c==']' && t!='[' || c=='}' && t!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}