import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]); // 요청 시간 기준으로 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // 소요시간, 요청시간
        
        int current = 0; // 현재 시간
        int answer = 0; // 평균 반환 시간
        int index = 0; 
        
        while(!pq.isEmpty() || index < jobs.length){
            while(index < jobs.length && jobs[index][0] <= current){ //현재 시간보다 작은 요청시각 + index < jobs.length
                pq.offer(new int[]{jobs[index][1], jobs[index][0]});
                index++;
            }
            
            if(!pq.isEmpty()){
                int[] job = pq.poll();
                current += job[0];
                answer += current - job[1];
            } else current = jobs[index][0];
            
        }
        return answer / jobs.length;
    }
}