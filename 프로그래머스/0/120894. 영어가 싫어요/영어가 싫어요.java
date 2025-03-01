import java.util.*;

class Solution {
    public long solution(String numbers) {
        HashMap<String,String> map = new HashMap<>(){{
            put("zero","0");
            put("one","1");
            put("two","2");
            put("three","3");
            put("four","4");
            put("five","5");
            put("six","6");
            put("seven","7");
            put("eight","8");
            put("nine","9");
        }};
        StringBuilder answer = new StringBuilder();
        
        while(numbers.length() != 0){
            for(String key : map.keySet()){
                if(numbers.startsWith(key)){
                    answer.append(map.get(key));
                    numbers = numbers.substring(key.length());
                    break;
                }
            }
        }
        
        return Long.parseLong(answer.toString());
    }
}