package basic;

public class 숨어있는숫자의덧셈 {
    public int solution(String my_string) {
        StringBuilder s = new StringBuilder();
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                s.append(my_string.charAt(i));
            }
        }
        
        for(char c : s.toString().toCharArray()){
            answer += Character.getNumericValue(c);
        }
        
        return answer;
    }
}
