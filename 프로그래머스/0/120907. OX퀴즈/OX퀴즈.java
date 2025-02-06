import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] newQuiz = quiz[i].split(" ");
            int x = Integer.valueOf(newQuiz[0]);
            int y = Integer.valueOf(newQuiz[2]);
            int z = Integer.valueOf(newQuiz[4]);
            
            switch(newQuiz[1]){
                case "+":
                    answer[i] = ((x + y == z) ? "O" : "X");
                    break;
                case "-":
                    answer[i] = ((x - y == z) ? "O" : "X");
                    break;
            }
        }
        
        return answer;
    }
}