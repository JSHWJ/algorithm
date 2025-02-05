import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }else return false;
    }
}