class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        char[] charArray = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            if(charArray[i] == ' '){
                sb.append(" ");
                num = 0;
            } else if(num % 2 == 0){ // 단어에서 짝수 인덱스라면
                sb.append(Character.toUpperCase(charArray[i]));
                num++;
            } else if(num % 2 == 1){ // 단어에서 홀수 인덱스라면
                sb.append(Character.toLowerCase(charArray[i]));
                num++;
            }
        }
        
        return sb.toString();
}
}