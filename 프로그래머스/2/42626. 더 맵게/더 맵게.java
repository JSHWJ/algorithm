import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        
        for(int s : scoville){
            heap.offer(s);
        }
        
        while(heap.size() >= 2 && heap.peek() < K){
            int first = heap.poll();
            int second = heap.poll();
            heap.offer(first + second * 2);
            count++;
        }
        
        return heap.peek() < K ? -1 : count;
    }
}