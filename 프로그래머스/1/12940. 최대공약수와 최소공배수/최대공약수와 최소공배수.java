class Solution {
    public int[] solution(int n, int m) { // 유클리드 호제법을 사용한다.
        int[] answer = new int[2];
        int operation = n * m;
        int temp = 0;
        
        while(m != 0){
            temp = m;
            m = n % m;
            n = temp;
        }
        
        answer[0] = n;
        answer[1] = operation / n;
        
        return answer;
    }
}