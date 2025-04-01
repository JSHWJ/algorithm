import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(n != 0){
            list.add(n % 3);
            n = n / 3;
        }
        
        int answer = 0;
        
        for(int i = 0; i < list.size(); i++){
            int num = list.get(list.size() - (i+1));
            answer += (int) Math.pow(3, i) * num;
        }
        
        return answer;
    }
}