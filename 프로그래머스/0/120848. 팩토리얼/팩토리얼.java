class Solution {
    public int solution(int n) {
        int answer = 1;
        int operation = 1;
        while(operation <= n){
            operation *= (++answer);
        }
        return answer - 1;
    }
}