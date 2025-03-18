class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int bottle = b * (n / a); // 받은 병수
            answer += bottle;
            n = n % a + bottle;
        }
        return answer;
    }
}