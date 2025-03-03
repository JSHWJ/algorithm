class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int width = (board[0] - 1) / 2;
        int height = (board[1] - 1) /  2; 
        
        for(String key : keyinput){
            if(key.equals("left")){
                if(answer[0] - 1 >= -width && answer[0] - 1 <= width){
                    answer[0]--;
                }else continue;
            }else if(key.equals("right")){
                if(answer[0] + 1 >= -width && answer[0] + 1 <= width){
                    answer[0]++;
                }else continue;
            }else if(key.equals("down")){
                if(answer[1] - 1 >= -height && answer[1] - 1 <= height){
                    answer[1]--;
                }else continue;
            }else if(key.equals("up")){
                if(answer[1] + 1 >= -height && answer[1] + 1 <= height){
                    answer[1]++;
                }else continue; 
            }
        }
        return answer;
    }
}