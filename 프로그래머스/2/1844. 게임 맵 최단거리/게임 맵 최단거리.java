import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int width = maps[0].length;
        int height = maps.length; // 세로
        
        int[] dx = {1, 0, -1, 0 };// 우, 하, 좌, 상
        int[] dy = {0, 1, 0, -1}; // 우, 하, 좌, 상
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // x좌표, y좌표, 이동한 거리
        
        boolean[][] visited = new boolean[height][width];
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0]; // x좌표
            int y = current[1]; // y 좌표
            int distance = current[2];
            
            if(x == (width - 1) && y == (height - 1)){
                return distance;
            }
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && nx < width && ny >= 0 && ny < height && maps[ny][nx] != 0 && !visited[ny][nx]){
                    queue.offer(new int[]{nx, ny, distance + 1});
                    visited[ny][nx] = true;
                }
            }
        }
        
        return -1;
    }
}