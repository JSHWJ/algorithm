class Solution {
    public int solution(int num, int k) {
        String answer = String.valueOf(num);
        if(answer.indexOf(String.valueOf(k)) != -1){
            return (answer.indexOf(String.valueOf(k)) + 1);
        }else return -1;
    }
}