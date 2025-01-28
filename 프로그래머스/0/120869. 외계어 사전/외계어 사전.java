import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        int num = 0;

        for(String d : dic){
            if(d.length() == spell.length){ // spell과 길이가 같다면
                char[] temp = d.toCharArray();
                Arrays.sort(temp);
                
                for(int i = 0; i < spell.length; i++){
                    if(spell[i].charAt(0) != temp[i]){
                        num = 0;
                        break;
                    }
                    num++;
                }
                if(num == spell.length){ return 1; }
            }
        }
        
        return 2;
    }
}