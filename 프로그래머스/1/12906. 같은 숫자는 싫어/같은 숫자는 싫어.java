import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i : arr){
            if(!stack.isEmpty()){
                if(stack.peek() != i){
                    stack.push(i);
                }
            } else break;
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}

