package basic;

import java.util.HashSet;
import java.util.Set;

public class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        int num = 0;
        
        for (String str : s1){
            set.add(str);
        }
        
        for (String str : s2){
            if(!set.add(str)){
                num += 1;
            }
        }
        return num;
    }
}

// 시간복잡도는 O(n+m)