import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        
        if (direction.equals("right")) {
            // 오른쪽으로 한 칸 밀기
            result[0] = numbers[numbers.length - 1]; // 마지막 원소를 첫 번째로
            for (int i = 0; i < numbers.length - 1; i++) {
                result[i + 1] = numbers[i];
            }
        } else {
            // 왼쪽으로 한 칸 밀기
            for (int i = 0; i < numbers.length - 1; i++) {
                result[i] = numbers[i + 1];
            }
            result[numbers.length - 1] = numbers[0]; // 첫 번째 원소를 마지막으로
        }

        return result;
    }
}
