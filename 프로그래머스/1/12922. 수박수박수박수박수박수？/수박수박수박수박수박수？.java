class Solution {
    public String solution(int n) {
        if(n == 0)
            return "";
        String watermelon = "수박";
        
        if(n % 2 == 1){ // 홀수인 경우에
            return watermelon.repeat(n / 2) + "수";
        } else if(n % 2 == 0) return watermelon.repeat(n / 2);
        
        return null;
    }
}