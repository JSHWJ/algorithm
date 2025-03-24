import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int turn = 0;
        
        for(int i = 0; i < priorities.length; i++){
            if(i == location){
                queue.offer(new int[]{priorities[i], 1});
                pq.offer(priorities[i]);
            } else {
                queue.offer(new int[]{priorities[i], 0});
                pq.offer(priorities[i]);
            }
        }
        
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int max = pq.peek(); // 가장 높은 숫자
        
            if(max == temp[0]){ // 가장 높은 숫자와 값이 같으면
                turn++;
                pq.poll();
                
                if(temp[1] == 1){
                    return turn;
                }
            } else {
                queue.offer(temp);
            }
        }

        return turn;
    }
}