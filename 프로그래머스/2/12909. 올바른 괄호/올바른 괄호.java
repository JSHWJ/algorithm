import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else if(c == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                } else return false;
            }
            
        }
        
        if(stack.isEmpty()){
            return true;
        } else return false;
    }
}

