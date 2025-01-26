import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>(); // 숫자, 숫자 등장 횟수
        int max = 0; // 최빈값
        int maxCount = 0; // 최빈값 나온 횟수
        boolean multiple = false; // 최빈값이 여러개인지의 여부
        
        for(int a : array){
            map.put(a, map.getOrDefault(a, 0) + 1);
            if(maxCount < map.get(a)){
                max = a;
                maxCount = map.get(a);
                multiple = false;
            } else if(maxCount == map.get(a)){
                multiple = true;
            }
        }
        
       if(multiple == false){
           return max;
       }else return -1;
    }
}