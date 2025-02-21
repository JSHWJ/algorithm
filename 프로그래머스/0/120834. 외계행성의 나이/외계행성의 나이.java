class Solution {
    public String solution(int age) {
        String temp = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for(char i : temp.toCharArray()){
            sb.append((char)('a' + (i - '0')));
        }
        return sb.toString();
    }
}