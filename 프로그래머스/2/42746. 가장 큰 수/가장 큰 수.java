import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] array = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b)); // 내림차순 정렬
        
        String answer = String.join("", array);

        return answer.startsWith("0") ? "0" : answer;
    }
}