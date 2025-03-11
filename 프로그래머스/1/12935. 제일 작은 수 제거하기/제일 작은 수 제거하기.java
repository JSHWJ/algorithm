import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length > 1){
            int min = Arrays.stream(arr).min().getAsInt();
            
            List<Integer> list = new ArrayList<>();
            for(int a : arr){
                if(a != min){
                    list.add(a);
                }
            }
            
            return list.stream().mapToInt(i -> i).toArray();
        } else return new int[]{-1};
    }
}