class Solution {
    public boolean solution(int x) {
        char[] array = String.valueOf(x).toCharArray();
        int value = 0;
        
        for(char i : array){
            value += i - '0'; // char을 int로 변환
        }
        
        return x % value == 0 ? true : false;
    }
}