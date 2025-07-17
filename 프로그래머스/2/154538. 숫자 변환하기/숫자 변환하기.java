import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[1000001];
        
        queue.offer(new int[]{x, 0}); // 값, 연산 횟수
        visited[x] = true;
        
        while(!queue.isEmpty()){
            int[] array = queue.poll();
            int value = array[0];
            int count = array[1];
            
            if(value == y){
                return count;
            }
            
            int[] newArray = new int[]{value + n, value * 2, value * 3};
            
            for(int a : newArray){
                if(a <= y && !visited[a]){
                    visited[a] = true;
                    queue.offer(new int[]{a, count + 1});
                }
            }
        }
       
        return -1;
    }
    
}