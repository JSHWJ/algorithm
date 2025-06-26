import java.util.*;

// k 개를 지울 수 있는 것임
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : number.toCharArray()){
            while(k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < c){
                sb.deleteCharAt(sb.length() - 1);
                k--; // k개까지만 지울 수 있음
            }
            sb.append(c);
        }
        return sb.substring(0, sb.length() - k);
    }  
}

