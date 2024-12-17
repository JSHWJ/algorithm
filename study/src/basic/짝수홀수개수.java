package basic;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num: num_list){
            if (num % 2 == 1){
                answer[1] += 1;
            } else{
                answer[0] += 1;
            }
        }
        return answer;
    }
}
