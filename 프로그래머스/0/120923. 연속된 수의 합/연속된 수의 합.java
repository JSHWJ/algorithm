class Solution {
    public int[] solution(int num, int total) {
        int sum = 0; // total = num * n + sum 형태로 만든다.
        int n = 0; // 초기값
        int[] answer = new int[num];
        
        for(int i = 1; i < num; i++){
            sum += i;
        }
        
        n = (total - sum) / num;
        
        for(int i = 0; i < num; i++){
            answer[i] = n + i;
        }
        
        return answer;
    }
}