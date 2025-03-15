class Solution {
    public int solution(int n) {
        int min = n - 1;
        
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                if(min > i){
                    return i;
                } else continue;
            }
        }
        return min;
    }
}