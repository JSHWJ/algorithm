import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> sortedList = Arrays.stream(emergency)
            .boxed()
            .sorted((a, b) -> b - a)
            .collect(Collectors.toList());
            
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++){
            answer[i] = sortedList.indexOf(emergency[i]) + 1;
        }
        
        return answer;
        
    }
}