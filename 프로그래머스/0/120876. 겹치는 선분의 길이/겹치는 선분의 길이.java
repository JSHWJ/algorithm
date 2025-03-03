class Solution {
    public int solution(int[][] lines) {
        int[] number = new int[201];
        int answer = 0;
        
        for(int[] line : lines){
            int start = line[0] + 100; //-100인 경우 +100해서 0으로 맞춤
            int end = line[1] + 100;
            
            for(int i = start; i < end; i++){
                number[i]++;
            }
        }
        
        for(int n : number){
            if(n >= 2){
                answer++;
            }
        }
        return answer;
    }
}