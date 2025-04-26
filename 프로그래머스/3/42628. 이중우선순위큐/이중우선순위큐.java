import java.util.*;


class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[2];
        
        for(String operation : operations){
            int num = Integer.parseInt(operation.substring(2));
            char o = operation.charAt(0);
            
            if(o == 'I'){
                pq.offer(num);
            } else if (o == 'D' && num == 1 && !pq.isEmpty()){
                int max = Collections.max(new ArrayList<>(pq));
                pq.remove(max);
            } else if (o == 'D' && num == -1 && !pq.isEmpty()){
                pq.poll();
            }
        }
        
        if(!pq.isEmpty()){
            answer[1] = pq.peek();
            answer[0] = Collections.max(new ArrayList<>(pq));
            return answer;
        } else {
            return new int[]{0, 0};
        }
    }
}