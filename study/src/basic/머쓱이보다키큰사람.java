package basic;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array){
            if(height < i){
                answer++;
            }
        }
        return answer;
    }
}


/* 자바 8 버전 부터
import java.util.*;

class Solution{
    public int solution(int[] array, int height){
        return (int) Arrays.stream(array)
            .filter(num -> num > height)
            .count();
    }
}*/