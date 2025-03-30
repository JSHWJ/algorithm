import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        for(int num : numlist){
            List<Integer> list = map.getOrDefault(Math.abs(n - num), new ArrayList<>());
            list.add(num);
            map.put(Math.abs(n - num), list);
        }
        
        List<Integer> answer = new ArrayList<>();
        
        for(int key : map.keySet()){
            if(map.get(key).size() != 1){
                answer.add(n + key);
                answer.add(n - key);
            } else answer.add(map.get(key).get(0));
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}