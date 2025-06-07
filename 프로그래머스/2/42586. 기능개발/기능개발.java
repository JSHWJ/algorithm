import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int day = (int) Math.ceil((100 - progresses[i]) / (float) speeds[i]);
            queue.offer(day);
        }
        
        int num = queue.poll();
        int count = 1;
        
        while(!queue.isEmpty()){
            if(queue.peek() <= num){ // num 보다 미리 다 끝낸 경우라면
                queue.poll();
                count++;
            } else { // num보다 오래 걸리는 경우에
                answer.add(count);
                num = queue.poll(); 
                count = 1;
            }
        }
        
        answer.add(count);
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}

