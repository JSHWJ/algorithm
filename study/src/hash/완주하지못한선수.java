package hash;
import java.util.*;

public class 완주하지못한선수 {
        public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String c : completion){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(String p : participant){
            map.put(p, map.getOrDefault(p, 0) - 1);
            if(map.get(p) == -1){
                return p;
            }
        }
        
        return "";
    }
}
