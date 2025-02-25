import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        Map<String, String> map = new HashMap<>();
        
        for(int i = 0; i < array.length; i++){ 
            map.put(array[i], String.valueOf(alphabet[i]));
        }
        
        String[] temp = letter.split(" ");
        
        for(String t : temp){
            answer.append(map.get(t));
        }
        
        return answer.toString();
    }
}