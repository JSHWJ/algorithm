class Solution {
    public int[] solution(long n) {
        int num = String.valueOf(n).length();
        int[] answer = new int[num];
        
        char[] charArray = String.valueOf(n).toCharArray();
        
        for(int i = 0; i < num; i++){
            answer[i] = charArray[num - 1 - i] - '0'; // char을 int로 변환
        }
        
        return answer;
    }
}