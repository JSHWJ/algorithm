class Solution {
    public int solution(int[][] board) {
        int length = board.length;
        boolean[][] dangerZone = new boolean[length][length];
        
        int[] x = {-1, -1, -1, 0, 0, 1, 1, 1}; // 행 위치
        int[] y = {-1, 0, 1, -1, 1, -1, 0, 1}; // 열 위치
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    dangerZone[i][j] = true; // 해당 위치
                    
                    for(int d = 0; d < 8; d++){
                        int dx = i + x[d];
                        int dy = j + y[d];
                        
                        if(dx >= 0 && dx < length && dy >= 0 && dy < length){
                            dangerZone[dx][dy] = true;
                        }
                    }
                }
            }
        }
        
        int safeZone = 0;
        
        for(boolean[] danger : dangerZone){
            for(int b = 0; b < length; b++){
                if(danger[b] == false){
                    safeZone++;
                }
            }
        }
        
        return safeZone;
        
    }
}