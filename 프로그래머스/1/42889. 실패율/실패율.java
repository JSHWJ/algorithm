import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Integer> map = new HashMap<>(); // 스테이지, 도전한 사용자
        HashMap<Integer, Float> failedPercentMap = new HashMap<>();
        
        int[] answer = new int[N];
        
        for(int i = 0; i < stages.length; i++){
            map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
        }
        
        int num = 0;
    
        for(int i = 1; i <= N; i++){
            if(map.containsKey(i)){
                failedPercentMap.put(i, getFailPercent(map.get(i), stages.length - num));
                num += map.get(i);
            } else{
                failedPercentMap.put(i, (float) 0);
            }
        }
        
        List<Map.Entry<Integer, Float>> list = new ArrayList<>(failedPercentMap.entrySet());
        
        list.sort((a, b) -> {
                 int valueCompare = b.getValue().compareTo(a.getValue());
                 if(valueCompare != 0){
                     return valueCompare;
                 }
                 return a.getKey().compareTo(b.getKey());
        });
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).getKey();
        }
      
        return answer;
    }
    
    public float getFailPercent(int unclearedPlayerNum, int playerNum){
        return (((float) unclearedPlayerNum) / playerNum);
    }
    
}