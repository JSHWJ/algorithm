class Solution {
    public int solution(String s) {
        if(s.contains("-")){
            return 0 - Integer.parseInt(s.replace("-", ""));
        } else return Integer.parseInt(s);
    }
}