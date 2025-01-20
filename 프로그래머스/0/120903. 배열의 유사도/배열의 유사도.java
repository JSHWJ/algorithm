import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        
        for(String temp1 : s1){
            set.add(temp1);
        }
        
        for(String temp2 : s2){
            set.add(temp2);
        }
        
        return s1.length + s2.length - set.size();
    }
}

// 시간복잡도는 O(n+m)