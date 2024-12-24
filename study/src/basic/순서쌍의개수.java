package basic;

import java.util.HashSet;
import java.util.Set;

public class 순서쌍의개수 {
     public int solution(int n) {
        Set<Integer> set = new HashSet<>();
        int duplication = 0;
        
        for (int i = 1; i <= n; i++){
            if (n % i == 0)  {
                if(set.contains(i)){
                    break;
                }
                if(n / i == i){
                    duplication += 1;
                    continue;
                };
                set.add(n / i);
                set.add(i);
            }
        }
        return set.size() + duplication;
    }   
}
