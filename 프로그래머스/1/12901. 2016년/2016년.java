class Solution {
    public String solution(int a, int b) {
        int totalDays = 0;
        String[] days = {"FRI", "SAT", "SUN","MON","TUE","WED","THU","FRI"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < a - 1; i++){
            totalDays += months[i];
        }        
        
        totalDays += b - 1; // 1일이기 때문에 1을 빼준다.
        
        return days[totalDays % 7];
    }
}