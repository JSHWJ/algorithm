class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char i : my_string.toCharArray()){
            if(!Character.isDigit(i) && sb.length() != 0){
                answer += Integer.parseInt(sb.toString());
                sb.setLength(0);
            } else if(Character.isDigit(i)){
                sb.append(i);
            }    
        }
        if(sb.length() != 0){
            answer += Integer.parseInt(sb.toString());
        }
        return answer;
    }
}