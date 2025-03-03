class Solution {
    public String solution(String myString) {
        StringBuilder s = new StringBuilder();
        for(char c : myString.toCharArray()){
            if(Character.isUpperCase(c)){
                s.append(Character.toLowerCase(c));
            }else s.append(c);
        }
        return s.toString().replace("a", "A");
    }
}