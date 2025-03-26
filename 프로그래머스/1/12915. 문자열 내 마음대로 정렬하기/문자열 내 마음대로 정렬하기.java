import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        TreeMap<Character, List<String>> map = new TreeMap<>();
        
        for(int i = 0; i < strings.length; i++){
            char temp = strings[i].charAt(n);
            List<String> list = map.getOrDefault(temp, new ArrayList<>());
            list.add(strings[i]);
            map.put(temp, list);
        }
        
        for(char c : map.keySet()){
            if(map.get(c).size() > 1){
                Collections.sort(map.get(c));
            }
        }
        
        List<String> answer = new ArrayList<>();
        
        for(List<String> v : map.values()){
            answer.addAll(v);
        }
        
        return answer.toArray(new String[0]); // toArray는 넘긴 배열의 크기 보고 작으면 딱 맞게 생성해준다.
    }
}