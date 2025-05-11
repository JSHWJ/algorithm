import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int idx = 0;
        int time = 0;
        int total_weight = 0;
        
        Queue<int[]> queue = new LinkedList<>(); // truck_weight, 현재 다리에 올린 시간
        
        while(idx < truck_weights.length || !queue.isEmpty()){ // 아직 다리에 올릴 트럭이 남은 경우와 이미 올라간 트럭 중 다 건너지 않은 트럭이 있는 경우
            time++;
            
            // 1. 다리에서 트럭 내리기
            if(!queue.isEmpty()){
                int[] first = queue.peek();
                if(time - first[1] >= bridge_length){
                    queue.poll();
                    total_weight -= first[0];
                }
            }
                
            // 2. 다리에 트럭 올리기
            // 트럭이 남아있으면서 + 전체 무게가 견딜 수 있는 무게 이하이면서 + 다리 위의 트럭의 개수가 최대 올라갈 수 있는 개수 이하인 경우
            if(idx < truck_weights.length && total_weight + truck_weights[idx] <= weight && queue.size() < bridge_length){
                queue.offer(new int[]{truck_weights[idx], time});
                total_weight += truck_weights[idx];
                idx++;
            }
            
        }
        
        
        return time;
    }
}