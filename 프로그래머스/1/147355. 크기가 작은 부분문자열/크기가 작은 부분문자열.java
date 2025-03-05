class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        int answer = 0;
        
        for(int i = 0; i < t.length(); i++){
            if(i > t.length() - pLength){
                break;
            }
            long temp = Long.parseLong(t.substring(i, pLength + i));
            if(temp <= pNum){
                answer++;
            }
        }
        return answer;
    }
}

    
    // int는 10자리 숫자까지 가능, long은 19자리 숫자까지 가능.
    // p 는 18자리 숫자까지 가능하기 때문에 long 해야한다.