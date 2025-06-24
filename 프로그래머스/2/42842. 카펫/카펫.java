import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int number = brown - 4; // 모서리 개수 제외한 숫자
        List<int[]> list = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(yellow); i++){
            if(yellow % i == 0){
                list.add(new int[]{Math.max(i, yellow/i), Math.min(i, yellow/i)});
            }
        }
        
        for(int[] l : list){
            int width = l[0];
            int height = l[1];
            
            if((width * 2 + height * 2) == number){
                return new int[]{width + 2, height + 2};
            }
        }
        
        return null;
        
    }
}