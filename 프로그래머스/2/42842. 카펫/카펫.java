import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        List<int[]> divisors = new ArrayList<>(); // 가로, 세로
        
        for(int i = 1; i <= Math.sqrt(yellow); i++){
            if(yellow % i == 0){
                int another = yellow / i;
                divisors.add(new int[]{Math.max(another, i), Math.min(another, i)});
            }
        }
        
        for(int[] divisor : divisors){
            if((brown - 4) == divisor[0] * 2 + divisor[1] * 2){
                return new int[]{divisor[0] + 2, divisor[1] + 2};
            }
        }
        
        return null;
    }
}