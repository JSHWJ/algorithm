import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 만약에 큰 수부터 나오게 하고 싶으면 new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        for(int s : scoville){
            pq.offer(s);
        }
        
        while(pq.peek() < K && pq.size() >= 2){
            int first = pq.poll();
            int second = pq.poll();
            
            pq.offer(first + second * 2);
            answer++;
        }
        
        if(pq.peek() < K){
            return -1;
        }
        
        return answer++;
    }
}