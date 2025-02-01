class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int answer = 0;
        
        for(int[] dot : dots){
            if(dot[0] != x && dot[1] != y){ // 처음 설정한 x와 y 값과 모두 다른 경우에
                answer = Math.abs(dot[0] - x) * Math.abs(dot[1] - y);
            }
        }
        
        return answer;
    }
}