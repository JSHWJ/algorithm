class Solution {
    public int[] solution(String[] strlist) {
        int[] count = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++){
            count[i] = strlist[i].length();
        }
        
        return count;
    }
}