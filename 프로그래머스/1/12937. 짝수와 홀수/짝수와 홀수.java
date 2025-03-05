class Solution {
    public String solution(int num) {
        int n = Math.abs(num);
        if(n % 2 == 1){
            return "Odd";
        } else if(n % 2 == 0){
            return "Even";
        } else if(n==0){
            return "Even";
        } return null;
    }
}