class Solution {
    public int solution(String[] babbling) {
        
        String[] words = {"aya", "ye", "woo", "ma" };
        int answer = 0;
        
        for(String b : babbling){
            if(isEmpty(b, words)){
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isEmpty(String b, String[] words){
        
        for(String word : words){
            if(b.indexOf(word) != -1){
                if(b.indexOf(word, b.indexOf(word) + word.length()) != -1){
                    return false;
                }
                b = b.replace(word, " ");
            }
        }
        
        return b.trim().isEmpty(); //  trim()을 해야하는 이유 : yayae 인 경우 aya를 ""로 치환해버리면 ye가 남게 되는데 이게 카운트 되어서 오류가 남
        
    }
    
    
}