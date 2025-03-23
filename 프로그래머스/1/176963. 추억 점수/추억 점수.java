import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        
        for(String[] list : photo){
            int score = 0;
            for(String p : list){
                for(int i = 0; i < name.length; i++){
                    if(p.equals(name[i])){
                        score += yearning[i];
                        break;
                    }
                }
            }
            answer.add(score);
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}