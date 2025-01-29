import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int near = 101; 
        
        for(int i : array){
            if(Math.abs(n - i) < near){
                near = Math.abs(n - i);
            }
        }
        
        for(int i : array){
            if(i == (n - near)){
                return (n - near);
            }
        }
        return n + near;
    }
}