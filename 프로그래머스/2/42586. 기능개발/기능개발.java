import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>(); 
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            double temp = (100 - progresses[i]) / (double)speeds[i];
            queue.offer((int) Math.ceil(temp)); // Math.ceil은 항상 반환값이 double임
        }
        
        int count = 1;
        int max = queue.poll();
        
        while(queue.peek() != null){
            if(max >= queue.peek()){
                queue.poll();
                count++;
                continue;
            }
            result.add(count);
            count = 1;
            max = queue.poll();
        }
        
        result.add(count); //큐의 size가 0이 되었을 때 while문에서 count는 저장되지 않기 때문에 필요함.
        
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}

/*
    큐가 아니라 그냥 int[]로 해결이 가능한 문제였음
    * int[] result : 100에서 기능 진도 빼고 스피드 값으로 나눈 값들의 배열

*/