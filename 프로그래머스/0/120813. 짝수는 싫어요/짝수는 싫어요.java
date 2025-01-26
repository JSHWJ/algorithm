class Solution {
    public int[] solution(int n) {
        int number = (int) Math.ceil(n / 2.0);
        int[] answer = new int[number];
        int initial = 0;
        
        for(int i = 1; i <= n; i += 2){
            answer[initial] = i;
            initial += 1;
        }
        
        return answer;
    }
}