class Solution {
    public int solution(int n) {
        if(n <= 1){
            return 0;
        }
        
        if(n == 2){
            return 1;
        }
        
        if(n == 3){
            return 2;
        }
        
        int answer = 2;
        
        for(int i = 5; i <= n; i+=2){ // 2의 배수를 거른다.
            boolean isPrime = false; 
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = true;
                    break;
                }
            }
            
            if(isPrime == false){
                answer++;
            }
        }
        return answer;
    }
}