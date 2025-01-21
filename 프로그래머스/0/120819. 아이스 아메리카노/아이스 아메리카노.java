class Solution {
    public int[] solution(int money) {
        int quotient = (int)money / 5500;
        int remainder = (int)money % 5500;
        
        int[] answer = new int[]{quotient, remainder};
        return answer;
    }
}