class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int temp = 0;
            
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0 && j * j == i){
                    temp++;
                } else if(i % j == 0){
                    temp += 2;
                }
            }
            
            if(temp > limit){
                answer += power;
            } else{
                answer += temp;
            }
        }
        
        return answer;
    }
}