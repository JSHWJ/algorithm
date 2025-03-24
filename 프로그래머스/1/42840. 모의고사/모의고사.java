import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int one_answer = 0;
        int two_answer = 0;
        int three_answer = 0;
        
        for(int i = 0; i < answers.length; i++){
            int temp = answers[i];
            
            if(one[i % one.length] == temp){
                one_answer++;
            }
                  
            if(two[i % two.length] == temp){
                two_answer++;
            }
            
            if(three[i % three.length] == temp){
                three_answer++;
            }
            
        }
        
        int max = Math.max(one_answer, two_answer);
        max = Math.max(max, three_answer);
        
        List<Integer> list = new ArrayList<>();
        
        if(max == one_answer){
            list.add(1);
        } 
        if(max == two_answer){
            list.add(2);
        }
        if(max == three_answer){
            list.add(3);
        }
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
    }
}