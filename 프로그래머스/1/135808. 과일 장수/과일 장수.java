import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        if(score.length < m){
            return 0;
        }
        
        for(int i = 0; i < score.length / m ; i++){
            int min = 11;
            for(int j = i * m; j < i * m + m; j++){
                if(min > arr[j]){
                    min = arr[j];
                }
            }
            result += min * m;
        }
        return result;
    }
}