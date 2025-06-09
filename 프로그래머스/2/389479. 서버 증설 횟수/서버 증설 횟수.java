import java.util.*;

// 시간대별 게임 이용자 수 : players, 최대 이용 가능한 사람 수 m, 서버 한 대 운영 시간 k
class Solution {
    public int solution(int[] players, int m, int k) {
        int count = 0; // 증설 횟수
        int current = 0; // 현재 서버 개수
        
        int[] server = new int[24];
        for(int s = 0; s < 24; s++){
            server[s] = 0; 
        }
        for(int i = 0; i < 24; i++){
            if(players[i] >= (server[i] + 1) * m){
                int temp = (players[i] / m) - server[i];
                count += temp;
                for(int j = i; j < k + i; j++){
                    if(j > 23){
                        break;
                    }
                    server[j] += temp;
                }
            }
        }
        return count;
    }
}