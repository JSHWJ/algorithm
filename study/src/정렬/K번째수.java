package 정렬;

import java.util.Arrays;

public class K번째수 {
        public int[] solution(int[] array, int[][] commands) {
        int [] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}


// Arrays.copyOfRange는 배열에서 원하는 범위의 인덱스로 잘라내어, 새로운 배열을 만드는 함수이다.