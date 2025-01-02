package basic;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) { 
        int answer = 1; // 페인트칠 하는 횟수 최소 1로 초기화 (최소 1번은 칠해야 함)
        int end = 0; // 페인트칠을 마지막으로 한 구역의 시작 인덱스
        
        for(int i = 1; i < section.length; i++){ // 페인트칠이 필요한 구역 순회
            if(section[end] + m <= section[i]){  // 페인트칠을 마지막으로 한 범위 안에 새로운 구역이 없다면
                answer += 1; // 페인트칠 횟수 1증가
                end = i; // 페인트칠을 마지막으로 한 구역의 시작 인덱스 갱신
            }
            
        }
        return answer;
    }
}
