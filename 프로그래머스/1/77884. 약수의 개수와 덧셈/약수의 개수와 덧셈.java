
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int temp = 0;
            
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){
                    temp++;
                    if(j != i / j){
                        temp++;
                    }
                }
            }
    
            if(temp % 2 == 1){ // 홀수인 경우
                answer -= i;
            } else answer += i;
        }
        return answer;
    }
}