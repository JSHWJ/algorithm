import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList());
        
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            List<Integer> temp = new ArrayList<>(list.subList(commands[i][0]-1, commands[i][1]));
            Collections.sort(temp);
            answer[i] = (int) temp.get(commands[i][2]-1);
        }

        
        return answer;
    }
}
