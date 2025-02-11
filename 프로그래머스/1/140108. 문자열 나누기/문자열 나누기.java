import java.util.*;

class Solution {
    public int solution(String s) {
        int xNum = 0;
        int otherNum = 0;
        int answer = 0;
        char x = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == x){
                xNum++;
            } else if(s.charAt(i) != x){
                otherNum++;
            }
            
            if(xNum == otherNum){
                answer++;
                xNum = 0;
                otherNum = 0;
                
                if(s.length() > i+1){
                    x = s.charAt(i+1);
                }
            }
        }
        
        if(xNum != otherNum){
            answer++;
        }
        
        return answer;
    }
}