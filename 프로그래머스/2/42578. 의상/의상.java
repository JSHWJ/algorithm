import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;
        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        
        if(map.size() == 1){
            return map.values().iterator().next();
        } else{
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                answer *= (entry.getValue() + 1);
            }
        }
        
        return answer - 1;
        
    }
  
}