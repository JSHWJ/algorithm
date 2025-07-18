import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        String[] array = s.split(" ");
        
        for(String a : array){
            if(a.equals("Z")){
                stack.pop();
            } else{
                stack.push(Integer.parseInt(a));
            }
        }
        
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        return answer;
    }
}