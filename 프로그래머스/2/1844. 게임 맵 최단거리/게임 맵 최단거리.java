import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int width = maps[0].length;
        int height = maps.length;
        
        int[] dx = {0, 0, 1, -1}; // x좌표 우, 좌, 하, 상
        int[] dy = {1, -1, 0, 0}; // y좌표 우, 좌, 하, 상
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // x좌표, y좌표, 이동한 거리
        
        boolean[][] visited = new boolean[height][width];
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if(x == (height - 1) && y == (width - 1)){
                return distance;
            }
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && nx < height && ny >= 0 && ny < width && maps[nx][ny] != 0 && !visited[nx][ny]){
                    queue.offer(new int[] {nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        
        return -1;
    }
}