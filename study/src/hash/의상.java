package hash;

import java.util.HashMap;

public class 의상 {
        public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1); // 카테고리 별 의상 개수를 저장한다.
        }
        
        int answer = 1;
        
        for(int c : map.values()){
            answer *= (c + 1); // + 1 은 그 카테고리 의상을 입지 않았을 때를 뜻한다.
        }
        return answer - 1; // 아무것도 입지 않았을 때의 경우를 제외한다. 
    }
}
