import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(int i : ingredient){
            sb.append(i);
        }
        
        String pattern = "1231";
        
        while(sb.indexOf(pattern) != -1){
            int index = sb.indexOf(pattern);
            sb.delete(index, index + 4);
            count++;
        } 
        
        return count;
    }
}