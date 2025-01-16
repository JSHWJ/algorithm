package basic;

public class 피자나눠먹기3 {
    public int solution(int slice, int n) {
        int answer = (int) Math.ceil((double)n / slice);
        return answer;
    }
}
    
    // 자바에서 정수 나눗셈 방지하려면 하나는 실수 형태여야한다.
