class Solution {
    public int solution(int[] numbers, int k) {
        int num = (k-1) * 2; // 공을 던지는 사람의 번호를 구하는 것이므로 -1
        int answer = num % numbers.length;
        
        return numbers[answer];
    }
}