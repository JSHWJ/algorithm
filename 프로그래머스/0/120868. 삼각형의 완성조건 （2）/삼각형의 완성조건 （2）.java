import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        //sides[1]이 가장 큰 값이라면?
        int min = sides[1] - sides[0];
        //나머지 한 변이 가장 큰 값이라면?
        int max = sides[0] + sides[1];
        return (max - min -1);
    }
}