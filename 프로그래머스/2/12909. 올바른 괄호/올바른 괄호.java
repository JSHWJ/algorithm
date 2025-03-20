import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        if(s.length() % 2 != 0){
            return false;
        }
        
        for(char i : s.toCharArray()){
            if(i == '('){ 
                stack.push(i);
            } else { // ) 이면
                if(!stack.isEmpty()){
                    stack.pop(); // 스택에서 (을 꺼냄
                } else return false; // empty 상태이면 짝이 맞지 않음
            }
        }
        
        if(stack.isEmpty()){ // stack에 아무것도 없으면
            return true;  //  true임
        } else return false;
    }
}