class Solution {
    public int solution(int n) {
        int primeCount = 0;
        
        if(n >= 2){
            primeCount++; // 2는 소수가 아니지만, 약수의 개수가 2개이므로 primeCount에 추가해준다.
        }
        
        for(int i = 3; i <= n; i+=2){
            if(isPrime(i)){ // 소수라면
                primeCount++;
            }
        }
        
        return n - 1 - primeCount;
    }
    
    public boolean isPrime(int number){
        for(int i = 3; i * i <= number; i++){
            if(number % i == 0){
                return false;
            }
        }
        
        return true;
    }
}