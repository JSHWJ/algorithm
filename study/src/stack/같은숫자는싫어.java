package stack;

import java.util.Stack;

public class 같은숫자는싫어 {
        public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(stack.isEmpty() || i != stack.peek()){
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}



/* stack 객체를 int[] 로 변환하는 방법 (java 8 이상) => stack.stream().mapToInt(i -> i).toArray();
   stack 객체를 Integer로 변환하는 방법 => stack.toArray(new Integer[0]);
    - 크기가 0인 배열을 전달하면, toArray는 스택의 크기를 동적으로 계산한다. */