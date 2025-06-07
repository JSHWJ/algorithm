import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
          
        for(int i = 0; i < progresses.length; i++){
            int num = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(num);
        }
        
        int day = queue.poll();
        int r = 1; // 배포되는 작업의 수
        
        while(!queue.isEmpty()){
            int temp = queue.poll();
            if(temp > day){
                day = temp;
                list.add(r);
                r = 1;
            } else {
                r++;
            }
        }
        
        list.add(r);
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
}
}

/*
    큐가 아니라 그냥 int[]로 해결이 가능한 문제였음
    * int[] result : 100에서 기능 진도 빼고 스피드 값으로 나눈 값들의 배열

*/