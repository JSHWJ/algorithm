import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = Arrays.stream(array)
            .max()
            .orElse(0);

        for(int i = 0; i < array.length; i++){
            if(answer[0] == array[i]){
                answer[1] = i;
            }
        }
        
        
        return answer;
    }
}