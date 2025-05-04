import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                if(!map.containsKey(key.charAt(i)) || map.get(key.charAt(i)) > i+1){
                    map.put(key.charAt(i), i+1);
                }
            }
        }
        
        for(int j = 0; j < targets.length; j++){
            int sum = 0;
            for(char c : targets[j].toCharArray()){
                if(map.containsKey(c)){
                    sum += map.get(c);
                } else {
                    answer[j] = -1;
                    break;
                }
            }
            if(answer[j] != -1){
                answer[j] = sum;}
                
        }
        
        return answer;
    }
}