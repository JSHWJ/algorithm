import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        
        for(char c : my_string.toCharArray()){
            set.add(c);
        }
        
        String answer = set.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
        
        
        return answer;
    }
}