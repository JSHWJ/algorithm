package basic;

public class 제곱수판별하기 {
    public int solution(int n) {
        double tempAnswer = Math.sqrt(n);
        if(tempAnswer == (int) tempAnswer){
            return 1;
        }else return 2;
    }
}
