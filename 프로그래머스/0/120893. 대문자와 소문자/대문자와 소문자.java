class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(char i : my_string.toCharArray()){
            if(Character.isUpperCase(i)){
                sb.append(Character.toLowerCase(i));
            }else{
                sb.append(Character.toUpperCase(i));
            }
        }
        return sb.toString();
    }
}