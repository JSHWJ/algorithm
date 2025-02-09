class Solution {
    public int solution(int[] array) {
        int answer = 0; 
        
        for(int a : array){
            String temp = String.valueOf(a);
            for(char c : temp.toCharArray()){
                if(c == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}