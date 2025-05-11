class Solution {
    public String solution(String s, String skip, int index) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char word : skip.toCharArray()){
            alphabet = alphabet.replace(String.valueOf(word), "");
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            int c_index = alphabet.indexOf(c);
            c_index += index;
            answer.append(alphabet.charAt(c_index % alphabet.length()));
        }
        return answer.toString();
    }
}