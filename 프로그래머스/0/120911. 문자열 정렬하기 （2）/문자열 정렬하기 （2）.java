import java.util.stream.*;
import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] answer = new char[my_string.length()];
        char[] array = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = Character.toLowerCase(array[i]);
        }
        
        Arrays.sort(answer);
        
        return new String(answer);
    }
}