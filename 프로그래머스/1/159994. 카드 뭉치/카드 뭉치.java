import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue_1 = new LinkedList<>();
        Queue<String> queue_2 = new LinkedList<>();
        
        for(String card1 : cards1){
            queue_1.offer(card1);
        }
        
        for(String card2 : cards2){
            queue_2.offer(card2);
        }
        
        for(String g : goal){
            if(!queue_1.isEmpty() && queue_1.peek().equals(g)){
                queue_1.poll();
            } else if(!queue_2.isEmpty() && queue_2.peek().equals(g)){
                queue_2.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}