import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int l : lost){
            lostSet.add(l);
        }
        
        for(int r : reserve){
            reserveSet.add(r);
        }
        
        for(int r : reserve){
            if(lostSet.contains(r)){
                reserveSet.remove(Integer.valueOf(r));
                lostSet.remove(Integer.valueOf(r));
            }
        } // 여벌 옷이 있는, 도난 당한 학생은 자신의 옷을 입는다
        
        for(int s : reserveSet){
            if(lostSet.contains(s - 1)){
                lostSet.remove(Integer.valueOf(s - 1));
            } else if(lostSet.contains(s + 1)){
                lostSet.remove(Integer.valueOf(s + 1));
            }
        }
        
        return n - lostSet.size();
    }
}