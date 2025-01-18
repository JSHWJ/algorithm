import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10; // 123이면 3만 남음
            n = n / 10; // 123을 10으로 나누면 12임
        }
        
        return answer;
    }
}

/*
원래 했던 방식
        int answer = String.valueOf(n)
            .chars() // intStream 형식으로 변환
            .map(Character::getNumericValue)
            .sum();
        return answer;
*/ 