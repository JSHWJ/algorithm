class Solution {
    public int solution(String name) {
        int answer = 0;
        
        for(char c : name.toCharArray()){
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }
        
        int length = name.length() - 1; // 좌우 이동 case #1 : 오른쪽으로만 쭉 가는 경우
        
        for(int i = 0; i < name.length(); i++){
            int next = i + 1; // next는 A가 아닌 알파벳 위치
            while(next < name.length() && name.charAt(next) == 'A'){
                next++;
            }
            
            length = Math.min(length, i + name.length() - next + Math.min(i, (name.length() - next)));
        }
        
        
        return answer + length;
    }
}